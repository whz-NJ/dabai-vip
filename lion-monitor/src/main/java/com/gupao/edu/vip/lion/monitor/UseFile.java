package com.gupao.edu.vip.lion.monitor;

@FunctionalInterface
public interface UseFile<T,X extends Throwable> {
void use(T instance) throws X;
}
