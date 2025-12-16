fun main() {
    val members : Array<String> = arrayOf("veronica", "maya", "santi")
    val age : Array<Byte> = arrayOf(20, 25, 30)
    members.set(1, "yaya")

    println(members[0])
    println(members[1])

    val names: Array<String?> = arrayOfNulls(3)
//    names.set(0, "lady")
//    names.set(1,"boni")
//    names.set(2, null)
    names[0] = "linda"
    names[1] = "popy"
    names[2] = "linata"
    println(names[2])
    println(names.size)
}