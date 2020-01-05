package org.tyaa.dockerizedspringbootapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerizedspringbootappApplication

fun main(args: Array<String>) {
	runApplication<DockerizedspringbootappApplication>(*args)
}
