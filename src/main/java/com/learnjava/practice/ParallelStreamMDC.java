package com.learnjava.practice;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.stream.Stream;

public class ParallelStreamMDC {

    private static Logger logger  = LoggerFactory.getLogger(ParallelStreamMDC.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info(Thread.currentThread().getName());
        String traceId = "100";
        MDC.put("id", traceId);
        logger.info("1------------------------");
        Stream.of(1, 2, 3, 4)
                .parallel()
                .forEach((num -> {
                    logger.info(Thread.currentThread().getName()+" "+ traceId.equals(MDC.get("id")));
                }));
        logger.info("2------------------------");
        Stream.of(1, 2, 3, 4)
                .parallel()
                // the key is the TraceableConsumer
                .forEach(new TraceableConsumer<>(num -> {
                    logger.info(Thread.currentThread().getName() + " " + traceId.equals(MDC.get("id")));
                }));
    }
}
