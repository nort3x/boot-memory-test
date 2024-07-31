package io.github.nort3x.meme_test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController {
    @GetMapping
    fun helloMem() = "memory: ${Runtime.getRuntime().freeMemory()}"
}