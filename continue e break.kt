fun main() {
    var i = 0
    while(i < 1000){
        if(i == 20){
            break
        }
        i++
        print("${i} ")

    }
    var j = 0
    var nome = "artur do grau"

    while (j < nome.length){
        print("${j}")
        j++
        if (j%2 == 1){
            continue
        }

    }
}