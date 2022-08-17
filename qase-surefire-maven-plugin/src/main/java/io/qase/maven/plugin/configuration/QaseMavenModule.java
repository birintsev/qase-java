package io.qase.maven.plugin.configuration;

import com.google.inject.*;
import io.qase.api.service.TestPlanService;
import io.qase.api.service.impl.TestPlanServiceImpl;
import io.qase.client.api.PlansApi;
import io.qase.configuration.QaseModule;
import io.qase.maven.plugin.codeparsing.ClassParser;
import io.qase.maven.plugin.codeparsing.MethodFilter;
import io.qase.maven.plugin.codeparsing.impl.ClassParserImpl;
import io.qase.maven.plugin.codeparsing.impl.MethodFilterImpl;

public class QaseMavenModule extends AbstractModule {

    public static final Injector INJECTOR = Guice.createInjector(new QaseMavenModule(), new QaseModule());

    @Provides
    @Singleton
    public ClassParser classParser() {
        return new ClassParserImpl();
    }

    @Provides
    @Singleton
    public MethodFilter methodFilter() {
        return new MethodFilterImpl();
    }

    @Provides
    public TestPlanService testPlanService(PlansApi plansApi) {
        return new TestPlanServiceImpl(plansApi);
    }
}
