package ru.netolohy

fun main() {
    val likes = 302
    val result =
        // если число оканчивается на 11
        if ((likes == 11) || (likes % 100) == 11) {
            "человекам (людям)"
        } else {
            // если число оканчивается на 1
            if (((likes % 100) == 1) || ((likes % 10) == 1)) {
                "человеку"
            } else {
                // во всех других случаях
                "человекам (людям)"
            }
        }
    println("понравилось $likes $result")
}