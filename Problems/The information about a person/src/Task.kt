import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var firstName = scanner.next()
    var lastName = scanner.next()
    var age = scanner.nextInt()
    println("${firstName.first()}. $lastName, $age years old")
}