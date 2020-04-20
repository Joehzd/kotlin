// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    var string: String = scanner.nextLine()
    var status: Boolean= false
    for (ch in string) {
        if (ch.isWhitespace()) {
            if (!status) {
                print("\\")
            }
            status = true
            continue
        }
        status = false
        print("${ch.isDigit()}")
    }
}