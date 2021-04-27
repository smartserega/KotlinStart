import abstract.ATeamplate
import abstract.BaseTeamplate
import interfaces.A
import interfaces.B
import interfaces.MyInterface

fun main(args: Array<String>) {


    //STRINGS

    var name: String = "Alex"
    var a: Int = 1
    var b: Int = 2


    println("Hello $name")
    println("a+b = ${a + b}")

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

    myFirstFunction()
    myFirstFunction2(1)
    print(myFirstFunction4(2, 2.3))

    interf()

    abs()
}


//FUNCTIONS

//return
fun myFirstFunction():Int{
return 1
}

//get var
fun myFirstFunction2(a: Long):Int{
    return a.toInt()
}

//void
fun myFirstFunction3(){

}

//another way return
fun myFirstFunction4(a: Long, b:Double) = a+b

//INTERFACES
fun interf (){
 var v1: MyInterface = A()
 var v2: MyInterface = B()
    println()
    println("Interfaces")
    v1.fun1()
    v2.fun1()
}

//ABSTRACR
fun abs (){
 var v1: BaseTeamplate = ATeamplate()
 v1.a()
 v1.minus()
 v1.a()


}

