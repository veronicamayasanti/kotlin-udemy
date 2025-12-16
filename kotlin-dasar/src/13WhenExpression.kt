fun main() {
    val nilai = "D"

    when (nilai) {
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("try again next year")
        }
    }

    when(nilai){
        "A", "B", "C" -> {
            println("selamat anda lulus")
        }
        else -> {
            println("Maaf, anda tidak lulus")
        }
    }


    val nilaiLulus : Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("Selamat anda lulus")
        !in nilaiLulus -> println("maaf tidak lulus")
    }

    val name = "maya"
    when(name){
        is String -> println("Name is string")
        !is String -> println("Name is not string")
    }

    val nilaiUjian = 89
    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("good job")
        nilaiUjian > 60 -> println("not bad")
        else -> println("ngulang tahun depan ya")
    }
}