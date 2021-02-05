fun main(args: Array<String>){
    var x = 0
    var y = 0

    while(x < 5){
        //start here

        // candidate 01
        //y = x - y

        //candidate 02
        //y = y + x

        //candidate 03
        /*
        y = y + 3
        if(y > 4)
            y = y -1
        */

        //candidate 04
        /*
        x = x + 2
        y = y + x
        */

        //candidate 05
        /*
        if(y < 5){
            x = x + 1
            if(y < 3)
                x = x - 1
        }
        y = y + 3
        */

        //static section
        print("$x$y ")
        x = x + 1

    }

}