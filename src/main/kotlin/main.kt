import kotlin.math.ceil
import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Hello World!")

    for(index in 1..10) {
        if(index == 5) {
            continue
        }
        println("=> $index")
    }
}