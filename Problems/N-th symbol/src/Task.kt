import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var words = scanner.nextLine()
    var index = scanner.nextInt()
    var key= words[index-1]
    println("Symbol # $index of the string \"$words\" is \'$key\' ")
}