package org.acme.vertxweb;

import io.quarkus.vertx.ConsumeEvent;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    @ConsumeEvent("greetings")
    public String hello(String name) {
        return "Hello " + name;
    }
}
