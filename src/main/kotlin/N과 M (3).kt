import java.io.BufferedReader
import java.io.InputStreamReader


val sb = StringBuffer()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (N, M) = readLine().split(" ").map { it.toInt() }
    dfs(0, N, M, IntArray(M))
    println(sb)
}


private fun dfs(depth: Int, limit: Int, maxDepth: Int, arr: IntArray) {
    if (depth == maxDepth) {
        repeat(maxDepth) {
            sb.append(arr[it]).append(" ")
        }
        sb.append('\n')
        return
    }

    for (i in 1..limit) {
        arr[depth] = i
        dfs(depth + 1, limit, maxDepth, arr)
    }
}


