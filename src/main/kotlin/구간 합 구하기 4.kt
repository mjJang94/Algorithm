import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (N, M) = readLine().split(" ").map { it.toInt() }
    val tokenizer = StringTokenizer(readLine(), " ")
    val array = IntArray(N + 1)
    val sb = StringBuffer()

    for (i in 1..N){
        array[i] = array[i - 1] + tokenizer.nextToken().toInt()
    }

    repeat(M) {
        val (start, end) = readLine().split(" ").map { it.toInt()}
        sb.append(array[end] - array[start - 1]).append('\n')
    }
    println(sb)
}