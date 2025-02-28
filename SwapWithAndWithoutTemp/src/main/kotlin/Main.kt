import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // 📌 Soru: İki sayının yerini değiştirme
    // Kullanıcıdan iki sayı alınarak, temp değişkeni kullanarak ve kullanmadan yer değiştirin.

    print("Birinci sayıyı girin: ")
    var sayi1 = input.nextInt()
    print("İkinci sayıyı girin: ")
    var sayi2 = input.nextInt()

    // 1️⃣ Temp değişkeni kullanarak değişim
    println("\nTemp değişkeni kullanarak değişim")
    swapWithTemp(sayi1, sayi2)

    // 2️⃣ Temp değişkeni kullanmadan değişim
    println("\nTemp değişkeni kullanmadan değişim")
    swapWithoutTemp(sayi1, sayi2)
}

// 🎯 1️⃣ Temp değişkeni kullanarak iki sayının yerini değiştiren metod
fun swapWithTemp(sayi1: Int, sayi2: Int) {
    var temp = sayi1 // Temp değişkenine sayi1 atanır
    var newSayi1 = sayi2 // sayi1 yerine sayi2 atanır
    var newSayi2 = temp // sayi2 yerine temp (eski sayi1) atanır

    println("Birinci sayı: $newSayi1, İkinci sayı: $newSayi2")
}

// 🎯 2️⃣ Temp değişkeni kullanmadan iki sayının yerini değiştiren metod
fun swapWithoutTemp(sayi1: Int, sayi2: Int) {
    var newSayi1 = sayi1
    var newSayi2 = sayi2

    newSayi1 = newSayi1 + newSayi2 // sayi1 ve sayi2 toplamı alınır
    newSayi2 = newSayi1 - newSayi2 // yeni sayi2 eski sayi1 olur
    newSayi1 = newSayi1 - newSayi2 // yeni sayi1 eski sayi2 olur

    println("Birinci sayı: $newSayi1, İkinci sayı: $newSayi2")
}
