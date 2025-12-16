const val APPLICATION = "KOTLIN DASAR"
const val VERSION = "0.0.1"
fun main() {
    println(APPLICATION)
    println(VERSION)

    var fullName = "veronica maya"
    fullName = "lala lili"
    println(fullName)

    val callMe = "santi"
//    callMe = "ica"
    println(callMe)

    var name: String? = null
    name = "maya"
    println(name)
    println(name?.length)

}