package io.qase.maven.plugin.codeparsing;

import io.qase.maven.plugin.codeparsing.model.ClassInfo;

import java.io.IOException;
import java.io.InputStream;

/**
 * @see MethodFilter
 * */
public interface ClassParser {

    ClassInfo parseCompiledClass(InputStream compiledClassInputStream) throws IOException;
}
