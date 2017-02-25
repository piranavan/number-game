package com.girish.jung.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pkanagaratnam on 25/02/2017.
 */
@RestController
public class TestController {

    @RequestMapping(value="/status", method = RequestMethod.GET)
    public ResponseEntity getStatus() {
        return ResponseEntity.ok("OK");
    }
}
