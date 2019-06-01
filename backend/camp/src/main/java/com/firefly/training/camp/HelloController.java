package com.firefly.training.camp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    @GetMapping(path = "/Hello/{name}")
    public String getHello(@PathVariable String name) {
        return "wait Hello, " + name + "!";
    }
}
