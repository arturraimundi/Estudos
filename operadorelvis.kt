fun main() {
    var str: String? = null
    str = "artur"
    if(str == null){
        println("essa variavel é nula")
    }else{
        println("essa variavel é ${str}")
    }

    print(str?: "nula")
}