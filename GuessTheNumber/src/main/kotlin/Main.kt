import java.util.Scanner

fun main() {
    val randomSayi = (0..2).random() // 0 ile 2 arasında rastgele sayı üretilir
    val input = Scanner(System.`in`)

    println("Bir sayı girin:")

    while (true) { // Sonsuz döngü, doğru tahmin edilene kadar devam eder
        val tahmin = input.nextInt()

        when {
            tahmin < randomSayi -> println("Daha büyük bir sayı girin")
            tahmin > randomSayi -> println("Daha küçük bir sayı girin")
            tahmin == randomSayi -> {
                println("Tebrikler! Bildiniz")
                break // Doğru tahmin yapıldığında döngü sonlanır
            }
        }
    }
}
