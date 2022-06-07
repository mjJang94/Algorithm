import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap

//5
//2 4 -10 4 -9

//2 3 0 3 1

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    val tokenizer = StringTokenizer(readLine(), " ")
    val origin = IntArray(N)
    val sorted = IntArray(N)
    val map = HashMap<Int, Int>()
    val buffer = StringBuffer()
    var rank = 0

    repeat(N) { i ->
        val value = tokenizer.nextToken().toInt()
        origin[i] = value
        sorted[i] = value
    }

    Arrays.sort(sorted)

    sorted.forEach { key ->
        if (!map.containsKey(key)){
            map[key] = rank
            rank++
        }
    }

    origin.forEach { key ->
        val ranking = map[key]
        buffer.append(ranking).append(" ")
    }

    println(buffer)
}