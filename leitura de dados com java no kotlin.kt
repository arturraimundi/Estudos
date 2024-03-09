import java.util.Scanner

fun main() {

    ler_int()
    ler_str()
    ler_double()
    ler_float()
    ler_bollean()

}

fun ler_int(){
    val Scanner = Scanner(System. `in`)
    println("digite um numero inteiro:")
    val num = Scanner.nextInt()
    println("voce digitou ${num}")
}

fun ler_double(){
    val Scanner = Scanner(System. `in`)
    println("digite um numero double:")
    val num = Scanner.nextDouble()
    println("voce digitou ${num}")
}
fun ler_str(){
    val Scanner = Scanner(System. `in`)
    println("digite um str:")
    val num = Scanner.next()
    println("voce digitou ${num}")
}
fun ler_float(){
    val Scanner = Scanner(System. `in`)
    println("digite um numero float:")
    val num = Scanner.nextFloat()
    println("voce digitou ${num}")
}

fun ler_bollean(){
    val Scanner = Scanner(System. `in`)
    println("digite um bool:")
    val num = Scanner.nextBoolean()
    println("voce digitou ${num}")

    Scanner.close()//fecha o scam

}