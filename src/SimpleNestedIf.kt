fun main(args:Array<String>){
    println("Enter your Grade")
    var grade = readLine()!!.toDouble()


    if(grade>=90){
        //block of code
        if(grade < 93){
            println("You are in A- level") // A minus
        }else{
            println("You are in A+ level") // A plus
        }

    }

    println("Your grade entred is $grade")
}