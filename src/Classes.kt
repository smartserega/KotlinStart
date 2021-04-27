fun main(args: Array<String>) {
//CLASSES
    val person = Person("Alex", "Bor", 24)
    println(person.firstName)
    println(person.lastName)
    println(person.age)

    val car = Car(20.4F, 10)
    println(car.isNew)
    car.isNew = false

}