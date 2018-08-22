/*
Math Calculator
 */
fun main(args:Array<String>) {
    println("--------- Math Clculator ---------")
    //var n1:Int=13
    print("Enter number 1 : ")
    var n1:Float= readLine()!!.toFloat()
    print("Enter number 2 : ")
    //var n2:Int?
    var n2:Float?
    //n2=45
    n2= readLine()!!.toFloat()
    //var sum:Int?
    var sum:Float?
    sum = n1+n2
    println("sum : "+sum)

}