package com.sagar.lintertest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LinterTestApplication

fun main(args: Array<String>) {
    runApplication<LinterTestApplication>(*args)
}
