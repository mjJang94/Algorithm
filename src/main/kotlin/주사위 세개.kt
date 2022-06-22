import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (A, B, C) = readLine().split(" ").map { it.toInt() }
    if (A == B && B == C) {
        println(10000 + (A * 1000))
    } else if (A == B || A == C) {
        println(1000 + (A * 100))
    }else if (B == C){
        println(1000 + (B * 100))
    } else{
        println(max(A, max(B, C)) * 100)
    }
}