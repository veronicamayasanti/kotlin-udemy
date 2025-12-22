fun main() {
    fun sayHellooo(name: String = ""): String {
//        return if
//        return if (name == ""){
//            "hello bro"
//        }else {
//            "hello $name"
//        }

//        return when
        return when(name){
            "" -> "Hello bro"
            else -> "hello $name"
        }
    }
    println(sayHellooo(name = "mayaaaaa"))
}