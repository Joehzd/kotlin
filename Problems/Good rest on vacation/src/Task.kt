// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val day=scanner.nextInt()
    val oneCost=scanner.nextInt()
    val oneTripCost=scanner.nextInt()
    val onNightCost=scanner.nextInt()
    print(day*oneCost+2*oneTripCost+(day-1)*onNightCost)
}