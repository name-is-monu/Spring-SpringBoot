package com.marshal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController
{
    @GetMapping("/get-res")
    public ResponseEntity<String> getResult()
    {
        String res="This is my first Rest Controller app";
        return new ResponseEntity<String>(res , HttpStatus.OK);
    }
}
