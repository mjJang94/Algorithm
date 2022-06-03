import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val S = readLine()
    val set = HashSet<String>()

    for (i in 0..S.length) {
        for (j in i..S.length) {
            S.substring(i, j).let { value ->
                if (value.isNotEmpty()){
                    set.add(value)
                }
            }
        }
    }
    println(set.size)
}


