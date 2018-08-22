fun main(args:Array<String>) {

    print("Enter name : ")
    var name = readLine()

    //var job:String = "Developer"
    print("Enter job")
    var job = readLine()

    print("Enter age")

    //var age = 25

    var age:Int = readLine()!!.toInt()

    var yearOfBirth:Int = 1993

    print("Enter department")

    //    var Dep:String?
    var Dep = readLine()
    //    Dep = "Software Engineering"

    var pi:Float = 3.14f

    val religion = "islam" //val is not variable it is for read only

    println("****** output *******")

    println("name : "+name)

    println("age : "+age)

    println("name : "+Dep)

    println("job : "+job)
}