
package com.pro

class App {
    val greeting: String
        get() {
            return "----- Kotlin Docker | Main -----"
        }
}

fun main() {
    println(App().greeting)
}
