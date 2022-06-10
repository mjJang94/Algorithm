import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val N = readLine().toInt()
    val list = LinkedList<Int>()
    val sb = StringBuffer()

    repeat(N) {
        val tokenizer = StringTokenizer(readLine(), " ")
        when (tokenizer.nextToken()) {
            "push_front" -> {
                list.addFirst(tokenizer.nextToken().toInt())
            }

            "push_back" -> {
                list.addLast(tokenizer.nextToken().toInt())
            }

            "pop_front" -> {
                sb.append(list.pollFirst() ?: -1).append('\n')
            }

            "pop_back" -> {
                sb.append(list.pollLast() ?: -1).append('\n')
            }

            "size" -> {
                sb.append(list.size).append('\n')
            }

            "empty" -> {
                sb.append(if (list.isEmpty()) 1 else 0).append('\n')
            }

            "front" -> {
                sb.append(list.peekFirst() ?: -1).append('\n')
            }

            "back" -> {
                sb.append(list.peekLast() ?: -1).append('\n')
            }
        }
    }
    println(sb)
}
