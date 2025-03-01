// Main fonksiyonu
fun main() {
    // Companion object fonksiyonu direkt sınıf adıyla çağırılabilir
    Ogrenci.staticMetotCalis()
    println("---------------")

    // Öğrenci nesnesi oluşturuyoruz
    val ogrenci1 = Ogrenci("Ali", 215541009, 0)
    ogrenci1.bilgiYaz()

    println("-------------------")

    val ogrenci2 = Ogrenci("Merve", 23001008, 1)
    ogrenci2.bilgiYaz()
}