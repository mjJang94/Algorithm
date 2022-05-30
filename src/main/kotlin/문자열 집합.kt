import java.util.*
import kotlin.collections.HashSet

/**
 *  5 11
baekjoononlinejudge
startlink
codeplus
sundaycoding
codingsh ====
baekjoon
codeplus
codeminus
startlink
starlink
sundaycoding
codingsh
codinghs
sondaycoding
startrink
icerink
 */

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt()
    val M = nextInt()

    val group = HashSet<String>()
    var count = 0

    for (i in 0 until N) {
        group.add(next())
    }

    for (i in 0 until M) {
        if (group.contains(next())){
            count++
        }
    }

    println(count)
}