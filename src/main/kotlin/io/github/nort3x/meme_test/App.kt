package io.github.nort3x.meme_test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// excluding database autoconfiguration dependencies to prevent hibernating halting
@SpringBootApplication(
    excludeName = [
        "org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration",
        "org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration"
    ]
)
class App

fun main() {
    runApplication<App>()
}