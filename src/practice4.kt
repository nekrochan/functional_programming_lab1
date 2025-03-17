/*
Практическая работа №4: Работа с числами
2642 дня записано в переменной. Определите количество лет, недель, дней.

Пример:
Дней - 2642
Вывод будет следующим:
"Лет: 7, недель: 12, дней: 3"
 */

fun main() {
    var daysTotal = 2642
    var years: Int = daysTotal / 365
    var weeks: Int = (daysTotal - years * 365) / 7
    var days: Int = daysTotal - years * 365 - weeks * 7
    print("Лет: $years, недель: $weeks, дней: $days")
}