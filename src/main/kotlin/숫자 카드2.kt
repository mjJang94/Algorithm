import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap

//10
//6 3 2 10 10 10 -10 -10 7 3
//8
//10 9 -5 2 3 4 5 -10
fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val map = HashMap<Int, Int>()

    val N = br.readLine().toInt()

    var st = StringTokenizer(br.readLine(), " ")

    for (i in 0 until N){
        val key = st.nextToken().toInt()
        map[key] = map.getOrDefault(key, 0) + 1
    }

    val M = br.readLine().toInt()

    st = StringTokenizer(br.readLine(), " ")
    for (i in 0 until M){
        val key = st.nextToken().toInt()

        sb.append(map.getOrDefault(key, 0)).append(" ")
    }

    println(sb)
}



