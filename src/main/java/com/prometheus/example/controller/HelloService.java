package com.prometheus.example.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
class HelloService {

    private final Counter counter;

    HelloService(MeterRegistry registry) {
        this.counter = Counter.builder("http_requests")
                .description("Count visits")
                .register(registry);
    }

    void increment() {
        counter.increment();
    }

}