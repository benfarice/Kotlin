import java.util.*

fun main(args:Array<String>){
    //Input
    println("Enter you date of birth : ")
    var DOB = readLine()!!.toInt()

    //Process
    //var age = 2018 - DOB
    var currentYear = Calendar.getInstance().get(Calendar.YEAR)
    var age = currentYear - DOB

    //Output
    println("Your age is $age years")
}