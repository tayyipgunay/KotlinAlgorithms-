import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // 📌 Soru: Girilen bir kelimenin tersini yazdırma
    // Kullanıcıdan bir kelime alarak, bu kelimenin tersini ekrana yazdırın.

    print("Bir kelime girin: ")
    val soz = input.nextLine()

    // 1️⃣ Döngü kullanarak ters çevirme
    println("\nDöngü ile ters çevirme")
    reverseWithLoop(soz)
}
    fun reverseWithLoop(soz: String) {
    var ters = ""
    for (i in soz.length - 1 downTo 0) {
        ters += soz[i] // Her karakteri sona ekleyerek ters çeviriyoruz
    }
    println("Ters hali: $ters")
}

// 🎯 2️⃣ Kotlin built-in fonksiyon kullanarak ters çeviren metod
fun reverseWithBuiltIn(soz: String) {
    val ters = soz.reversed() // Kotlin'in hazır reversed() fonksiyonunu kullanıyoruz
    println("Ters hali: $ters")
}