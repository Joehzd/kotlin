import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var x1=scanner.nextInt()
    var y1=scanner.nextInt()
    var x2=scanner.nextInt()
    var y2=scanner.nextInt()
    if (Math.abs(x2-x1)==1 && Math.abs(y2-y1)==2){
        print("YES")
    }else if (Math.abs(x2-x1)==2 && Math.abs(y2-y1)==1){
        print("YES")
    }else{
        print("NO")
    }

    // write your code here
//    fun main(args: Array<String>) {
//        val scanner = Scanner(System.`in`)
//        val (x1, y1, x2, y2) = scanner.nextLine().trim().split(' ').map(String::toInt)
//
//        val one = (x1 - x2).absoluteValue == 1 && (y1 - y2).absoluteValue == 2
//        val two = (y1 - y2).absoluteValue == 1 && (x1 - x2).absoluteValue == 2
//
//        println(if (one || two) "YES" else "NO")
//    }
}