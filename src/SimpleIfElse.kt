fun main(args:Array<String>){
    println("Enter your Grade")
    var grade = readLine()!!.toDouble()


    if(grade>=90){
        //block of code
        grade+=3
        println("You are in A level")
    }/*else{
        println("You are not in A level")
    }*/else if(grade>=80 && grade<90){
        println("You are in B level")
    }else if(grade>=70 && grade<80){
        println("You are in C level")
    }else{
        println("You fail")
    }

    println("Your grade entred is $grade")
}