// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var a = scanner.next().first()+2
    var b = scanner.next().first()+1
    var c = scanner.next().first()
    print(a==c && b==a)
}