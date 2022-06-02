import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val (A, B) = readLine().split(" ").map { it.toInt() }
    val map = HashMap<Int, Int>()
    var count = 0

    var tokenizer = StringTokenizer(readLine(), " ")
    repeat(A) {
        val key = tokenizer.nextToken().toInt()
        map[key] = map.getOrDefault(key, 0) + 1
    }

    tokenizer = StringTokenizer(readLine(), " ")
    repeat(B) {
        val key = tokenizer.nextToken().toInt()
        map[key] = map.getOrDefault(key, 0) + 1
    }

    map.forEach { entry ->
        if (entry.value == 1) {
            count++
        }
    }

    println(count)
}
