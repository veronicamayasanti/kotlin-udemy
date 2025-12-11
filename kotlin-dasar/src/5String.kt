fun main() {
    var firstName: String = "veronica"
    var lastName: String = "maya"

    var address: String = """
        |jalan jalan kemana aja,
        |kecamatan situ aja,
        |kabupaten ini dia,
        
    """.trimMargin()

    var address2: String = """
        > jalan jalan kemana aja,
        > kecamatan situ aja,
        > kabupaten ini dia,
        
    """.trimMargin()

    var fullName : String = firstName + " " + lastName
    var fullName2 : String = "$firstName $lastName"
    var desc: String = "$fullName length = ${fullName.length}"


    println(firstName)
    println(lastName)
    println(address)
    println(address2)
    println(fullName)
    println(fullName2)
    println(desc)
}