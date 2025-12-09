// integer number
// type         size(bits)      min value           max value
// byte         9               -128                127
// short        16              -32768              32767
// int          32              -2,147,483,648/(-2^31)  -2,147,483,647/(-2^31-1)
// long         64              -2^63               2^63-1

// floating point number
// type         size(bits)      significant bits        exponent bits       decimal digits
// float        32              24                      8                   6-7
// double       64              53                      11                  15-16


fun main() {
    var age : Byte = 33
    var height : Int = 153
    var distance : Short = 2000
    var balance : Long  = 112345678L
    println(age)
    println(height)
    println(distance)
    println(balance)

    var value : Float = 98.98F
    var radius : Double = 12345678998.12345
    println(value)
    println(radius)

//    underscore in number
    var date : Byte = 2_1
    var long : Int = 1_8_8
    var money : Long = 100_000_000L
    println(date)
    println(long)
    println(money)

//    conversion
    var number : Int = 100
    var byte : Byte = number.toByte()
    var short : Short = number.toShort()
    var int : Int = number.toInt()
    var longg : Long = number.toLong()
    var float : Float = number.toFloat()
    var double : Double = number.toDouble()

    println(byte)
    println(short)
    println(int)
    println(longg)
    println(float)
    println(double)
}