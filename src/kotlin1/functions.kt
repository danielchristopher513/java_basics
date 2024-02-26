package kotlin1

class functions {
}

fun add(x:Int,y:Int)=x+y;
fun printmsg(msg:String,prefix : String ="Info"):Unit{
    println("$msg and $prefix ")
}

fun main() {
    println("sum is ${add(1, 2)}");
    printmsg("hello")
}