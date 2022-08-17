package io.qase.maven.plugin.testplan;

import io.qase.api.service.TestPlanService;
import io.qase.maven.plugin.QaseSurefirePlugin;
import io.qase.maven.plugin.codeparsing.ClassParser;
import io.qase.maven.plugin.codeparsing.MethodFilter;
import io.qase.maven.plugin.testplan.impl.CucumberStrategy;
import io.qase.maven.plugin.testplan.impl.DefaultStrategy;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static io.qase.maven.plugin.configuration.QaseMavenModule.INJECTOR;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TestPlanExecutionSetupStrategyFactory {

    private static final String CUCUMBER_GROUP_ID = "io.cucumber";

    private static final String CUCUMBER_ARTIFACT_ID = "cucumber-java";

    public static TestPlanExecutionSetupStrategy createStrategy(QaseSurefirePlugin qaseSurefirePlugin) {
        if (isCucumberInClassPath(qaseSurefirePlugin)) {
            return new CucumberStrategy(
                qaseSurefirePlugin,
                INJECTOR.getInstance(TestPlanService.class)
            );
        } else { // for Junit4, Junit5, and TestNG
            return new DefaultStrategy(
                qaseSurefirePlugin,
                INJECTOR.getInstance(MethodFilter.class),
                INJECTOR.getInstance(ClassParser.class),
                INJECTOR.getInstance(TestPlanService.class)
            );
        }
    }

    private static boolean isCucumberInClassPath(QaseSurefirePlugin qaseSurefirePlugin) {
        return qaseSurefirePlugin.getProject().getModel().getDependencies().stream().anyMatch(dependency ->
            CUCUMBER_GROUP_ID.equals(dependency.getGroupId()) && CUCUMBER_ARTIFACT_ID.equals(dependency.getArtifactId())
        );
    }
}
