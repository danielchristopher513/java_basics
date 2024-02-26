package kotlin1

import java.util.Scanner

fun drive(speed: String = "fast") {

    println("driving $speed")
}
fun main(args: Array<String>) {

    println("Hello, ${args[0]}")

    val reader = Scanner(System.`in`)
    var temperature = reader.nextInt()

    val isHot = if (temperature > 40) true else false
    println(isHot)

    println(drive("slow"))
}