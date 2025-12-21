fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
){
    println("Hello $firstName, $middleName, $lastName")
}
fun main() {
    fullName("veronica", "maya", "santi")
    fullName(
        lastName = "santi",
        firstName = "veronica",
        middleName = "maya"
    )
}