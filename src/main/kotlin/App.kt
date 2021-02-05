fun main(args: Array<String>){
    /*
    PRIMERA SECCION DE CODIGO
    var x = 1
    println("Before the loop. x = $x.")
    while (x < 4){
        println("In the loop x = $x.")
        x = x + 1
    }
    println("After the loop. x = $x.")
    */

    //SEGUNDA SECCION DE CODIGO

    val x = 3
    val y = 1
    /*  SUBSECCION
    if (x > y){
        println("x is greater than y")
    }else{
        println("x is not greater than y")
    }

    */
    println(if(x>y)"x is greater than y" else "x is not greater than y")
    println("This line runs no matter what")
}