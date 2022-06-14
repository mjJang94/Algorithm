import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (hour, min) = readLine().split(" ").map { it.toInt() }
    val N = readLine().toInt()
    val sb = StringBuffer()

    var tempHour = 0
    val tempMin = N + min

    if (tempMin > 59) {
        tempHour = tempMin / 60
        min = tempMin % 60
    } else {
        min = tempMin
    }

    if (tempHour > 0) {
        hour += tempHour
        if (hour >= 24) {
            hour -= 24
        }
    }
    sb.append(hour).append(" ").append(min)
    print(sb)
}

