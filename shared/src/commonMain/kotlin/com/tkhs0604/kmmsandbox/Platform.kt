package com.tkhs0604.kmmsandbox

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform