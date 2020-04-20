// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    var text1: String = scanner.next()
    var text2: String = scanner.next()
    print(text1.toLowerCase() == text2.toLowerCase())
}