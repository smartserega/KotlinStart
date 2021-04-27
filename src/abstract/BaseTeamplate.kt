package abstract

open abstract class BaseTeamplate {

    var count = 0;

    fun a() {
        count++
        println("COUNT $count")
    }

    abstract fun minus()
}