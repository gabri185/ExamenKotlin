import java.util.*
import java.util.concurrent.ThreadLocalRandom

val tabla6 = Array<Int>( 11, {it * 6 }  )

var tamaño: Int = readLine()!!.toInt()
fun Random.nextInt(range: IntRange): Int {
    return range.start + nextInt(range.last - range.start)
}
val random = Random()

val arrayRan = Array<Int>( tamaño, {random.nextInt(50..250)}  )



