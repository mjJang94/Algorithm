import java.lang.StringBuilder
import java.util.Scanner
import kotlin.collections.HashMap

//26 5
//Bulbasaur
//Ivysaur
//Venusaur
//Charmander
//Charmeleon
//Charizard
//Squirtle
//Wartortle
//Blastoise
//Caterpie
//Metapod
//Butterfree
//Weedle
//Kakuna
//Beedrill
//Pidgey
//Pidgeotto
//Pidgeot
//Rattata
//Raticate
//Spearow
//Fearow
//Ekans
//Arbok
//Pikachu
//Raichu
//25
//Raichu
//3
//Pidgey
//Kakuna

fun main() = with(Scanner(System.`in`)) {

    val N = nextInt()
    val M = nextInt()

    val map = HashMap<String, String>()
    val buffer = StringBuilder()

    for (index in 1 until N + 1) {
        val number = index.toString()
        val name = next()
        map[number] = name
        map[name] = number
    }

    for (i in 0 until M) {
        buffer.append(map[next()]).append("\n")
    }

    println(buffer)
}