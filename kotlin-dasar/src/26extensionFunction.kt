fun String.hello():String = "Hello $this"

fun String.printHello(): Unit = println("hello $this")

fun main() {
    val name = " maya "
    println(name.hello())
    name.printHello()
    "veronica".printHello()
}