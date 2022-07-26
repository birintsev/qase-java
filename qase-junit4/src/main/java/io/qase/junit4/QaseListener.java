package io.qase.junit4;


import io.qase.api.StepStorage;
import io.qase.api.annotation.CaseId;
import io.qase.api.annotation.CaseTitle;
import io.qase.client.model.ResultCreate;
import io.qase.client.model.ResultCreate.StatusEnum;
import io.qase.client.model.ResultCreateCase;
import io.qase.client.model.ResultCreateSteps;
import io.qase.reporters.QaseReporter;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import java.util.LinkedList;
import java.util.Optional;

import static io.qase.api.utils.IntegrationUtils.getStacktrace;
import static io.qase.client.model.ResultCreate.StatusEnum.*;
import static io.qase.configuration.QaseModule.INJECTOR;

@Slf4j
public class QaseListener extends RunListener {

    private static final String REPORTER_NAME = "JUnit 4";

    private final QaseReporter qaseReporter;

    public QaseListener() {
        qaseReporter = INJECTOR.getInstance(QaseReporter.class);
        qaseReporter.setupReporterName(REPORTER_NAME);
    }

    @Override
    public void testStarted(Description description) {
        qaseReporter.onTestCaseStarted();
    }

    @Override
    public void testFinished(Description description) {
        qaseReporter.onTestCaseFinished(getResultItem(description, PASSED, null));
    }

    @Override
    public void testFailure(Failure failure) {
        qaseReporter.onTestCaseFinished(getResultItem(failure.getDescription(), FAILED, failure.getException()));
        qaseReporter.onTestRunFinished();
    }

    @Override
    public void testAssumptionFailure(Failure failure) {
        qaseReporter.onTestCaseFinished(getResultItem(failure.getDescription(), SKIPPED, null));
        qaseReporter.onTestRunFinished();
    }

    @Override
    public void testIgnored(Description description) {
        qaseReporter.onTestCaseFinished(getResultItem(description, SKIPPED, null));
        qaseReporter.onTestRunFinished();
    }

    @Override
    public void testRunFinished(Result result) {
        qaseReporter.onTestRunFinished();
    }

    private ResultCreate getResultItem(Description description, StatusEnum status, Throwable error) {
        Long caseId = getCaseId(description);
        String caseTitle = null;
        if (caseId == null) {
            caseTitle = getCaseTitle(description);
        }
        Optional<Throwable> optionalThrowable = Optional.ofNullable(error);
        String comment = optionalThrowable
                .flatMap(throwable -> Optional.of(throwable.toString())).orElse(null);
        Boolean isDefect = optionalThrowable
                .flatMap(throwable -> Optional.of(throwable instanceof AssertionError))
                .orElse(false);
        String stacktrace = optionalThrowable
                .flatMap(throwable -> Optional.of(getStacktrace(throwable))).orElse(null);
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

    private Long getCaseId(Description description) {
        CaseId caseIdAnnotation = description.getAnnotation(CaseId.class);
        return caseIdAnnotation != null ? caseIdAnnotation.value() : null;
    }

    private String getCaseTitle(Description description) {
        CaseTitle caseTitleAnnotation = description.getAnnotation(CaseTitle.class);
        return caseTitleAnnotation != null ? caseTitleAnnotation.value() : null;
    }
}
