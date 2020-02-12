package com.bugtracker.controller

@RestController
class HomeController {

    @GetMapping("/")
    fun home() = "message" to "Hello app"

}