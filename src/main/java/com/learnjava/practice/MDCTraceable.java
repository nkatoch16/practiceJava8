package com.learnjava.practice;

import org.slf4j.MDC;

import java.util.Optional;

public abstract class MDCTraceable {

    private final Long id;

    private final Long userId;

    public MDCTraceable() {
        id = Optional.ofNullable(MDC.get("id")).map(Long::parseLong).orElse(0L);
        userId = Optional.ofNullable(MDC.get("userId")).map(Long::parseLong).orElse(0L);
    }

    public void setMDC(){
        MDC.put("id", id.toString());
        MDC.put("userId", userId.toString());
    }

    public void cleanMDC(){
        MDC.clear();
    }
}