package com.tdorosz.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tomek
 */
@RestController
public class MainController {

    @GetMapping("/hello")
    String hello() {
        return "Hello from MainController";
    }
}
