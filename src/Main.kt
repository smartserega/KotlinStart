

fun main(args: Array<String>){


    //STRINGS

    var name: String = "Alex"
    var a: Int = 1
    var b: Int = 2


    println("Hello $name")
    println("a+b = ${a+b}")

    //CLASS
    val userJava = UserJava("email@email.com")

    println("Java example ${userJava.email}")

    val userKotlin = UserKotlin("emailKotlin@email.com")
    println("Kotlin example ${userKotlin.email}")

    //difference between var and val (mutable un mutable) like final in java


    //TYPES DATA (VARIABLES)


    var a1: String = "123"

    var a6: Byte = 12       //8 bit
    var a0: Short = 11      //16 bit
    var a2: Int = 123       //32bit /  integer number
    var a5: Float = 0.14F   //32 bit
    var a3: Long = 123      //64bit /  long numbers
    var a4: Double = 0.14e2 //64 bit

    // convert types
    var b1: Long = a2.toLong()

    var c1: Char = 'f'
    var b2: Boolean = false
    var b4: Boolean = true




}