package br.com.braul

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BrauApplication

fun main(args: Array<String>) {
	runApplication<BrauApplication>(*args)
}
