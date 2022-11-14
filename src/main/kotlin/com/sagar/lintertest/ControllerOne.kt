package com.sagar.lintertest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/one")
class ControllerOne {

    @GetMapping
    fun getOne(): String {
        return "Hello"
    }
}