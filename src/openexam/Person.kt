package openexam

open class Person (var name: String) {
    override fun toString(): String {
        return "Person(name='$name')"
    }

    open fun getAddress() : String{
        return "test"
    }


}