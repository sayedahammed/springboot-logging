package com.example.springbootelk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
public class ELKController {

    @RequestMapping(value = "/elk")
    public String helloWorld() {
        String response = "Welcome to JavaInUse" + new Date();
        log.info(response);
        return response;
    }

    @RequestMapping(value = "/exception")
    public String exception() {

        try {
            throw new Exception("An error occurred...");
        } catch (Exception e) {
            log.error(e.toString());
            return e.toString();
        }
    }
}
