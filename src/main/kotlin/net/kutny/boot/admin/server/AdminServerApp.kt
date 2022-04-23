package net.kutny.boot.admin.server

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableAdminServer
@SpringBootApplication
class AdminServerApp

fun main(args: Array<String>) {
    runApplication<AdminServerApp>(*args)
}
