package com.alibou.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    private int counter;
    @GetMapping
    public String demo() {
        counter++;
        return String.format("<h1>Response from demo controller: Response number: %d<h1/>", counter);
    }
}
