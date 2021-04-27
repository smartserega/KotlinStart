class Car(private var weight: Float,private var size: Int) {

    var isNew: Boolean = true
        get() {
            return weight > size
        }
        set(value) {
            if(value){
                println("Yes")
            }
            field = value
        }
}