// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    var text=scanner.nextLine()
    for (a in text){
        println(a.isUpperCase() || (a.isDigit() && a in '1'..'9'))
    }
}