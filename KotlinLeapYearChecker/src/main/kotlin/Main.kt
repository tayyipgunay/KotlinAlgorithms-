import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // 📌 Soru: Artık yıl kontrolü
    // Kullanıcıdan bir yıl alarak, o yılın artık yıl olup olmadığını belirleyin.
    // Bir yıl şu koşullara göre artık yıldır:
    // - 400'e tam bölünüyorsa artık yıldır.
    // - 100'e tam bölünüyorsa artık yıl değildir.
    // - 4'e tam bölünüyorsa artık yıldır.
    // - Diğer durumlarda artık yıl değildir.

    print("Bir yıl girin: ")
    val yil = input.nextInt()

    if (yil % 400 == 0 || (yil % 4 == 0 && yil % 100 != 0)) {
        println("$yil bir artık yıldır.")
    } else {
        println("$yil bir artık yıl değildir.")
    }
}
