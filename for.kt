fun main() {
    for(i in 1..10){//1 em 1
        println(i)
    }

    for(i in 10 downTo 1){
        print(" ${i}")
    }
    println()
    var str = "criar app app ep"
    for(i in str){
        print("${i} ")
    }

    for(i in 1..10 step(3)){
        print("${i} ")
    }
}