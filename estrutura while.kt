fun main() {
    var i: Int=0
    while (i < 10){

        i++
        print("${i} ")
    }
    var str = "app app ep"
    var j = 0
    while (j <= str.length){
        j++
        print("${j} ")
    }

    println("\n")

    do{
        println("qual seu nome")
        val nome = readLine()
    }while ( nome=="")
}