/*
Практическая работа №3: Разделение числа на символы
Напишите программу, которая будет получать от пользователя число с 4
числами.
Реализуйте разделение этого числа на отдельные цифры.

Пример:
Число 5934
Результат 5, 9, 3, 4
 */

fun main() {
    print("Число: ")
    var input: Int = readln()!!.toInt()

    var inputStr: String = input.toString()

    if (inputStr.length == 4) {
        print( "Результат: " +
                inputStr.map { it }.joinToString(", ")
        )
    } else {
        print("Ввод некорректен")
    }
}