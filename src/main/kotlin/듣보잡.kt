import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.HashSet

//3 4
//ohhenrie
//charlie
//baesangwook
//obama
//baesangwook
//ohhenrie
//clinton

//2
//baesangwook
//ohhenrie

//첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다.
// 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
// 이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
// 듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val (N, M) = readLine().split(' ').map { it.toInt() }
    val list = mutableListOf<String>()
    val set = HashSet<String>()
    val sb = StringBuilder()

    repeat(N) {
        set.add(readLine())
    }
    repeat(M) {
        val value = readLine()
        if (set.contains(value)) list.add(value)
    }

    sb.appendLine(list.size)
    list.sorted().forEach {
        sb.appendLine(it)
    }

    println(sb)
}