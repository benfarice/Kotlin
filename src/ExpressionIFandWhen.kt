fun main(args:Array<String>){
    var a = 67
    var b = 6
    var max = if(a>b) a else b
    println("Max is $max")

    //When
    var age:Int = 23
    var isYoung = when(age){
        30->true
        else ->false
    }
    println("is Young : $isYoung")

}