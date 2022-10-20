package controleFluxo

fun main() {

    var i = 0
    while (i < 10000) {

        if (i == 50) {
            break
        }

        print("$i ")
        i++
    }

    println()

    var j = 0
    while (j < 80) {

        if (j < 50) {
            j++
            continue
        }
        print("$j ")
        j++
    }

}