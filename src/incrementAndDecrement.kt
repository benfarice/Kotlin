fun main(args:Array<String>) {

    var x = 56
    var y = 76
    var z = ++x + y // (++x) = (x=x+1) -- (--x) = (x=x-1)
    println("z : $z")
    var m = x++ + y
    println("m : $m")
    println("x : $x")
}