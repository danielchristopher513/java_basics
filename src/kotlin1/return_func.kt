package kotlin1

fun operation(): (Int,Int) -> Int {
    return ::square
}

fun square(x: Int,y : Int) :Int{
    return x*y

}

fun main() {
    val func = operation()
    println(func(2,3))
}