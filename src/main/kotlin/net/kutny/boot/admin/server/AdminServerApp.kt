package net.kutny.boot.admin.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AdminServerApp

fun main(args: Array<String>) {
    runApplication<AdminServerApp>(*args)
}
