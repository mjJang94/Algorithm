import java.util.*


/**
 *  5
    6 3 2 10 -10
    8
    10 9 -5 2 3 4 5 -10
 */
    fun main() = with(Scanner(System.`in`)) {

        val buffer = StringBuffer()
        val N = nextInt()
        val array = IntArray(N)

        for (i in 0 until N){
            array[i] = nextInt()
        }

        Arrays.sort(array)

        val M = nextInt()

        for ( i in 0 until M){
           val checkTargetNumber = nextInt()
           var left = 0
           var right = N - 1

            while (left <= right){
                val index = (left + right) / 2
                val cardNumber = array[index]

                if (cardNumber == checkTargetNumber){
                    buffer.append(1).append(" ")
                    break
                }

                if (cardNumber > checkTargetNumber){
                    right = index - 1
                } else{
                    left = index + 1
                }

                if (left > right){
                    buffer.append(0).append(" ")
                    break
                }
            }
        }

        println(buffer)
    }



