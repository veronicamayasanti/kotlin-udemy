fun main() {
    fun factorialLoop(value: Int): Int {
        //        factorial for loop
        var result = 1

        for (i in value downTo 1){
            result *= i
        }



        return result
    }
    println(factorialLoop(5))

    fun factorialRecursive(nilai: Int):Int {
        return when (nilai){
            1->1
            else -> nilai * factorialRecursive(nilai-1)
        }
    }
    println("ini factorialRecursive = " + factorialRecursive(5) )
}