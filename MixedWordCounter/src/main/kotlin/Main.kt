// Proje Adı: MixedWordCounter
// Verilen bir dizide sadece String olan elemanların sayısını hesaplayan fonksiyon

fun kelimeSayisiniHesapla(dizi: List<Any>): Int {
    return dizi.count {
        it is
                String
    } // Sadece String türündeki elemanları say
}

// Fonksiyonun çalışmasını test etmek için örnek kullanım
fun main() {
    val karisikDizi = listOf("Turkcell", 2024, "Bootcamp", 3.14, "Kotlin", true, "ile", "başlıyor", 42)
    val sonuc = kelimeSayisiniHesapla(karisikDizi)

    println("Kelime Sayısı: $sonuc")
    // Çıktı: Kelime Sayısı: 5
}
/*
// Döngü ile dizideki sadece String türündeki elemanları sayan fonksiyon

fun kelimeSayisiniHesapla(dizi: List<Any>): Int {
    var sayac = 0

    for (eleman in dizi) {
        if (eleman is String) { // Eğer eleman String türündeyse
            sayac++
        }
    }

    return sayac
}

// Fonksiyonun çalışmasını test etmek için örnek kullanım
fun main() {
    val karisikDizi = listOf("Turkcell", 2024, "Bootcamp", 3.14, "Kotlin", true, "ile", "başlıyor", 42)
    val sonuc = kelimeSayisiniHesapla(karisikDizi)

    println("Kelime Sayısı: $sonuc")
    // Çıktı: Kelime Sayısı: 5
}

 */
