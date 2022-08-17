package io.qase.maven.plugin.codeparsing.impl;

import io.qase.maven.plugin.codeparsing.model.ClassInfo;
import io.qase.maven.plugin.codeparsing.MethodFilter;
import io.qase.maven.plugin.codeparsing.criteria.MethodInfoCriteria;
import io.qase.maven.plugin.codeparsing.model.MethodInfo;
import io.qase.maven.plugin.util.TriPredicate;

import java.util.Collection;
import java.util.stream.Collectors;

public class MethodFilterImpl implements MethodFilter {

    @Override
    public Collection<MethodInfo> filterMethodsByCriteria(ClassInfo classInfo, MethodInfoCriteria methodInfoCriteria) {
        return classInfo.getMethods()
            .parallelStream()
            .filter(methodInfo -> satisfiesCriteria(methodInfo, methodInfoCriteria))
            .collect(Collectors.toList());
    }

    private boolean satisfiesCriteria(MethodInfo methodInfo, MethodInfoCriteria methodInfoCriteria) {
        TriPredicate<String, String, Object> annotationAttributePredicate =
            methodInfoCriteria.getAnnotationAttributePredicate();
        return methodInfo.getAnnotatedWithCollection().parallelStream().anyMatch(
            annotationInfo -> annotationInfo.getAttributes().entrySet().parallelStream()
                .anyMatch(entry -> annotationAttributePredicate.test(
                    annotationInfo.getAnnotationClassCanonicalName(), entry.getKey(), entry.getValue()
                ))
        );
    }
}