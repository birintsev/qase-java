package io.qase.maven.plugin.codeparsing.visitor;

import io.qase.maven.plugin.codeparsing.model.AnnotationInfo;
import io.qase.maven.plugin.codeparsing.model.MethodInfo;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

import static io.qase.maven.plugin.codeparsing.CodeParsingConstants.ASM_API_VERSION;

public class MethodInfoVisitor extends MethodVisitor {

    private final MethodInfo methodInfo;

    public MethodInfoVisitor(MethodInfo methodInfo) {
        super(ASM_API_VERSION);
        this.methodInfo = methodInfo;
    }

    @Override
    public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        AnnotationInfo annotationInfo = new AnnotationInfo();
        annotationInfo.setAnnotationClassCanonicalName(Type.getType(desc).getClassName());
        methodInfo.addAnnotatedWith(annotationInfo);
        return new AnnotationInfoVisitor(annotationInfo);
    }
}
