fun sayHello(firsName: String,lastName: String?){
    if (lastName == null){
        println("Hello $firsName")
    }else {
        println("Hello $firsName $lastName")
    }
}

fun main() {
    sayHello("Veronica", "maya")
    sayHello("maya", null)
    sayHello("santi", "wijaya")
}