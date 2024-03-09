fun main() {
    vetor_inteiros()
    vetor_inteiros2()
    vetor_bool()
    vetor_str()
    vetor_float()
    vetor_char()
}

fun vetor_inteiros() {
    var numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(numeros)

    for (i in 0..numeros.size - 1) {
        print("${numeros[i]} ")
    }
}

fun vetor_inteiros2() {
    var n = Array(10, { i -> i })
    for (i in 0..n.size - 1) {
        print("${n[i]} ")
    }
}
fun vetor_bool(){
    var bolleanos = booleanArrayOf(true, false, true, true)
    for (i in 0..bolleanos.size - 1) {
        print("${bolleanos[i]} ")
    }

}

fun vetor_str(){
    var str = arrayOf("alagoass", "artur")
    for (i in 0..str.size - 1) {
        print("${str[i]} ")
    }

}

fun vetor_char(){
    var c = charArrayOf('a','b', 'c')
    for (i in 0..c.size - 1) {
        print("${c[i]} ")
    }
}

fun vetor_float(){
    var f = floatArrayOf(1.3f, 2.5f, 34.342f)
    for(i in 0..f.size-1){
        print("${f[i]} ")
    }

}
