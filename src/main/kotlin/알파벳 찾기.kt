import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val S = next()
    val sb = StringBuffer()
    val map = HashMap<Char, Int>()

    ('a'..'z').forEach {
        map[it] = -1
    }

    S.forEachIndexed { index, c ->
        val value = map[c] ?: return@forEachIndexed
        if (map.keys.contains(c) && value < 0) {
            map[c] = index
        }
    }

    map.forEach {
        sb.append(it.value).append(' ')
    }
    println(sb)
}