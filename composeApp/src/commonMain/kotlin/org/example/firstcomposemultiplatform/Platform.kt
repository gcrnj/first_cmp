package org.example.firstcomposemultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform