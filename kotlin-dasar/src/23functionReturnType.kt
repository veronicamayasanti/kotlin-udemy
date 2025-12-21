fun sum(a:Int, b:Int):Int{
    val total = a+b
    return total
}

fun bagi(a: Int, b: Int): Int{
    if (b == 0){
        return 0
    }else {
        val result = a/b
        return result
    }
}

fun main() {
    val result = sum(1,2)
    println(result)
    println("ini bagi " + bagi(10,2))
}