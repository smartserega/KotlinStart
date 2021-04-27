import javax.xml.stream.events.Characters

fun main (args: Array<String>){

    var nums = 1..10
    val value = 21
    val char = 'a'..'z'
    println(value in nums)

    println(isCharPresent('i', char))

}

fun isCharPresent(char: Char,  characters: CharRange) = char in characters