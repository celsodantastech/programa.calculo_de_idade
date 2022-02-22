fun main(args: Array<String>) {

//1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.


    println("Digite a sua idade")
    var idade = readLine()!!.toInt()

    println("O seu ano de nascimento é ${2022 - idade}")
}