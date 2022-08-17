package io.qase.maven.plugin.codeparsing.visitor;

import io.qase.maven.plugin.codeparsing.model.AnnotationInfo;
import org.objectweb.asm.AnnotationVisitor;

import static io.qase.maven.plugin.codeparsing.CodeParsingConstants.ASM_API_VERSION;

public class AnnotationInfoVisitor extends AnnotationVisitor {

    private final AnnotationInfo annotationInfo;

    public AnnotationInfoVisitor(AnnotationInfo annotationInfo) {
        super(ASM_API_VERSION);
        this.annotationInfo = annotationInfo;
    }

    @Override
    public void visit(String name, Object value) {
        annotationInfo.addAttribute(name, value);
    }
}
