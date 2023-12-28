package com.bruno.aws_ms01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class TestController {

    @GetMapping("/status")
    public ResponseEntity<String> statusApi() {
        return ResponseEntity.ok().body("Server is running......");
    }
}
