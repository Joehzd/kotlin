import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var c = scanner.nextInt()
    println(a !=b && a !=c && b !=c)
}