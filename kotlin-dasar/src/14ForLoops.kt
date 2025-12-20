fun main() {
//    for loops untuk memanggil data satu per satu dari array
    val names = arrayOf("veronica", "maya", "santi")
    var total = 0
    for ( name in names){
        println(name)
        total++
    }

    println("total perulangan = $total")

    for (value in 0..10){
        println(value)
    }

    for (value2 in 10 downTo 0 step 2){
        println(value2)
    }

    val ukuranArray = names.size - 1
    for (i in 0..ukuranArray) {
        println("index $i = ${names.get(i)}")
    }
}