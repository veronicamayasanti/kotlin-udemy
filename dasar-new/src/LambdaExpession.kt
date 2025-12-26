// lambda expression adalah function yang tidak memiliki nama

fun toUpper(value: String): String = value.uppercase()

fun main() {
    val contohLambda : (String, String) -> String = {firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("A", "B")
    println(result)


    val lambdaName: (String) -> String = {
        "hello $it"
    }
    val name = lambdaName("maya")
    println(name)

    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Veronica Maya Santi"))
}