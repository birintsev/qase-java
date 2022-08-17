package io.qase.maven.plugin.codeparsing;

import io.qase.maven.plugin.codeparsing.model.ClassInfo;
import io.qase.maven.plugin.codeparsing.criteria.MethodInfoCriteria;
import io.qase.maven.plugin.codeparsing.model.MethodInfo;

import java.util.Collection;

/**
 * @see ClassParser
 * */
public interface MethodFilter {

    Collection<MethodInfo> filterMethodsByCriteria(ClassInfo classInfo, MethodInfoCriteria methodInfoCriteria);
}
