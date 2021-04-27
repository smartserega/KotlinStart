import Collors.*

fun main(args: Array<String>) {

    var n = 30


    var r = when (n) {
        1 -> "one"
        2 -> "two"
        3 -> "there"
        4 -> "four"
        5 -> "five"
        6 -> "six"
        else -> "none"
    }
    println(r)

    println(getColor(WHITE))

    var a:Int = 6
    var b:Int = 6
    getRes(a,b)
}

fun getColor(color: Collors) = when (color) {
    BLACK, WHITE -> "black and white"
    GREEN -> "green"
    else -> "none"
}


fun getRes(a: Int, b: Int) {
    when   {
        a>b -> println("$a > $b = true")
        a<b -> println("$a < $b = true")
        a==b -> println("$a == $b = true")
        else -> println("error")

    }

}

