// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var c = scanner.nextInt()
    println(a + b == 20 || a + c == 20 || b + c == 20)
}