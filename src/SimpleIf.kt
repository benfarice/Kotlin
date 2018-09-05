fun main(args:Array<String>){
    println("Enter your Grade")
    var grade = readLine()!!.toDouble()


    if(grade>=90){
        //block of code
        grade+=3
        println("You are in A level")
    }

    if(grade>=50 && grade <=71){
        grade+=10
        println("You get extra 10 points")
    }

    println("Your grade entred is $grade")
}