package com.tkhs0604.kmmsandbox

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return """
            |Hello, ${platform.name}!
            |There are only ${daysUntilNewYear()} days left until New Year! 🎆
            """.trimMargin()
    }
}