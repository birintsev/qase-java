package io.qase.maven.plugin.util;

public interface TriPredicate<T, U, R> {

    boolean test(T t, U u, R r);
}
