import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // 📌 Soru: Üslü sayı hesaplama
    // Kullanıcıdan taban (sayı) ve üs değerini alarak, tabanın üs kadar kuvvetini hesaplayın.

    print("Taban sayısını girin: ")
    val sayi = input.nextInt()
    print("Üs değerini girin: ")
    val us = input.nextInt()

    // 1️⃣ Döngü kullanarak üslü sayı hesaplama
    println("Döngü ile üslü sayı hesaplama")
    powerWithLoop(sayi, us)

}

// 🎯 1️⃣ Döngü kullanarak üslü sayı hesaplayan metod
fun powerWithLoop(sayi: Int, us: Int) {
    var sonuc = 1
    for (i in 1..us) {
        sonuc *= sayi // Tabanı üs kadar çarpıyoruz
    }
    println("Sonuç: $sonuc")
}