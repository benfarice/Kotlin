fun main(args:Array<String>){
    println("Enter an X number")
    var x = readLine()!!.toInt()
    when(x){
        1-> println("You will get married a girl named soukaina")
        2-> println("You will get married a girl named oumaima")
        3-> println("You will get married a girl named kenza")
        4,5-> println("You will get married a girl named salma")
        in 23..76-> println("You will get married a girl named sara")
        !in 78..98-> println("You will get married a girl named kenza")

        else ->{
            println("You will get married a beautiful muslim girl")
        }

    }
}