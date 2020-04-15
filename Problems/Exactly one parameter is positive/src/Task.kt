import java.util.Scanner

var count=0
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var c = scanner.nextInt()
    check(a)
    check(b)
    check(c)
    println(count==1)
}
fun check(a: Int):Boolean{
    if (a>0){
        count+=1
        return true
    }
    return false;
}