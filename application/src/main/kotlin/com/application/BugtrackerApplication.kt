package com.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com"])
class BugtrackerApplication

fun main(args: Array<String>) {
	runApplication<BugtrackerApplication>(*args)
}
