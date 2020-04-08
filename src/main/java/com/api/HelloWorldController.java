package com.api;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private static final String template = "Hello , %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/helloworld")
    public HelloWorld helloWorld(@RequestParam(value = "name",defaultValue = "World") String name)
    {
        return new HelloWorld (counter.incrementAndGet(),String .format (template,name));
    }
}
