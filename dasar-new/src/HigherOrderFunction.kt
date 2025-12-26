// higher order function adalah function yang menggunakan function sebagai parameter atau mengembalikan function
// penggunaan higher order function kadang berguna ketika ingin membuat function yang general
// dan ingin mendapatkan input yang flexibel berupa lambda, yang bisa dideklarasikan oleh user ketika memanggil function tersebut

fun main() {
    fun hello(name: String, transformer: ( String) -> String): String {
        val nameTransfrom = transformer(name)
        return "Hello $nameTransfrom"
    }

    val lambdaUpper = {value: String -> value.uppercase()}
    println(hello("lambda upper", lambdaUpper))

    println(hello("LAMBDA LOWERCASE", {value: String -> value.lowercase()}) )

    val result1 = hello("Maya", {value: String -> value.lowercase() })
    val result2 = hello("Maya") {value: String ->
        value.lowercase() }
    println(result1)
    println(result2)
}