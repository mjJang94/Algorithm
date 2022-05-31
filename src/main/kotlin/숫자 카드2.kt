import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap

//10
//6 3 2 10 10 10 -10 -10 7 3
//8
//10 9 -5 2 3 4 5 -10
fun main() = with(Scanner(System.`in`)) {

    val strBuilder = StringBuilder()
    val N = nextInt()
    val array = IntArray(N)

    for (i in 0 until N) {
        array[i] = nextInt()
    }

    Arrays.sort(array)

    val M = nextInt()

    for (i in 0 until M) {
        val key = nextInt()

        strBuilder.append(upperBound(array, key) - lowerBound(array, key)).append(' ')
    }
    println(strBuilder)
}

fun lowerBound(array: IntArray, key: Int): Int {
    var left = 0
    var right = array.size

    while (left < right) {
        val midIndex = (left + right) / 2
        val target = array[midIndex]

        if (key <= target) {
            right = midIndex
        } else {
            left = midIndex + 1
        }
    }
    return left
}

fun upperBound(array: IntArray, key: Int): Int {
    var left = 0
    var right = array.size

    while (left < right) {
        val midIndex = (left + right) / 2
        val target = array[midIndex]

        if (key < target) {
            right = midIndex
        } else {
            left = midIndex + 1
        }
    }
    return left
}

//10
//6 3 2 10 10 10 -10 -10 7 3
//8
//10 9 -5 2 3 4 5 -10

//fun hashMap() {
//    val reader = BufferedReader(InputStreamReader(System.`in`))
//    val stringBuilder = StringBuilder()
//
//    val map = HashMap<Int, Int>()
//
//    val N = reader.readLine().toInt()
//
//    var tokenizer = StringTokenizer(reader.readLine(), " ")
//
//    for (i in 0 until N) {
//        val key = tokenizer.nextToken().toInt()
//        map[key] = map.getOrDefault(key, 0) + 1
//    }
//
//    val M = reader.readLine().toInt()
//
//    tokenizer = StringTokenizer(reader.readLine(), " ")
//
//    for (i in 0 until M){
//        val key = tokenizer.nextToken().toInt()
//        stringBuilder.append(map.getOrDefault(key, 0)).append(" ")
//    }
//
//    println(stringBuilder)
//}
