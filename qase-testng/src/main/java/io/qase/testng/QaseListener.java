package io.qase.testng;

import io.qase.api.StepStorage;
import io.qase.client.model.ResultCreate;
import io.qase.client.model.ResultCreate.StatusEnum;
import io.qase.client.model.ResultCreateCase;
import io.qase.client.model.ResultCreateSteps;
import io.qase.client.services.QaseTestCaseListener;
import lombok.AccessLevel;
import lombok.Getter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Optional;

import static io.qase.api.utils.IntegrationUtils.*;
import static io.qase.configuration.QaseModule.INJECTOR;

public class QaseListener extends TestListenerAdapter implements ITestListener {

    private static final String REPORTER_NAME = "TestNG";

    @Getter(lazy = true, value = AccessLevel.PRIVATE)
    private final QaseTestCaseListener qaseTestCaseListener = initializeQaseReporter();

    @Override
    public void onTestStart(ITestResult result) {
        getQaseTestCaseListener().onTestCaseStarted();
        super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        getQaseTestCaseListener().onTestCaseFinished(getResultItem(tr, StatusEnum.PASSED));
        super.onTestSuccess(tr);
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        getQaseTestCaseListener().onTestCaseFinished(getResultItem(tr, StatusEnum.FAILED));
        super.onTestFailure(tr);
    }

    @Override
    public void onFinish(ITestContext testContext) {
        getQaseTestCaseListener().reportResults();
        super.onFinish(testContext);
    }

    private ResultCreate getResultItem(ITestResult result, StatusEnum status) {
        Optional<Throwable> resultThrowable = Optional.ofNullable(result.getThrowable());
        String comment = resultThrowable
                .flatMap(throwable -> Optional.of(throwable.toString())).orElse(null);
        Boolean isDefect = resultThrowable.flatMap(throwable -> Optional.of(throwable instanceof AssertionError))
                .orElse(false);
        String stacktrace = resultThrowable.flatMap(throwable -> Optional.of(getStacktrace(throwable))).orElse(null);
        Method method = result.getMethod()
                .getConstructorOrMethod()
                .getMethod();
        Long caseId = getCaseId(method);
        String caseTitle = null;
        if (caseId == null) {
            caseTitle = getCaseTitle(method);
        }
        LinkedList<ResultCreateSteps> steps = StepStorage.getSteps();
        return new ResultCreate()
                ._case(caseTitle == null ? null : new ResultCreateCase().title(caseTitle))
                .caseId(caseId)
                .status(status)
                .comment(comment)
                .stacktrace(stacktrace)
                .steps(steps.isEmpty() ? null : steps)
                .defect(isDefect);
    }

    private QaseTestCaseListener initializeQaseReporter() {
        QaseTestCaseListener reporter = INJECTOR.getInstance(QaseTestCaseListener.class);
        reporter.setupReporterName(REPORTER_NAME);
        return reporter;
    }
}
