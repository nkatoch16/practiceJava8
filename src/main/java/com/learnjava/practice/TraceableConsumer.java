package com.learnjava.practice;

import java.util.function.Consumer;

public class TraceableConsumer<T> extends MDCTraceable implements Consumer<T> {

    private final Consumer<T> target;

    public TraceableConsumer(Consumer<T> target) {
        this.target = target;
    }

    @Override
    public void accept(T t) {
        setMDC();
        target.accept(t);
    }
}