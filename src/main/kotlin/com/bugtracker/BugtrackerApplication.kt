package com.bugtracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BugtrackerApplication

fun main(args: Array<String>) {
	runApplication<BugtrackerApplication>(*args)
}
