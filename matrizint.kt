fun main() {
    val linhas = 3
    val colunas = 10
    val matriz: Array<Array<Int>> = Array(linhas) { Array(colunas) { 0 } }
    var digito = -1

    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            print("${matriz[i][j]} ")
        }
        println()
    }
    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            matriz[i][j] = digito++
        }
        println()
    }
    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            print("${matriz[i][j]} ")
        }
        println()
    }

    println("quantidade de linhas = ${matriz.size}")//para ver a quantidade de linhas
    println("quanitdade de colunas = ${matriz[0].size}")

}