fun main() {
    var str: String? = null
    str = "artur"

    if (str != null){
        println("caiu no if")
    }
    str.let {
        println("caiu no let")
    }
}