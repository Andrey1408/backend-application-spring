package ru.ifmo.pga.software.design.todo.list

import org.springframework.boot.SpringApplication
import ru.ifmo.pga.software.design.core.Application

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}