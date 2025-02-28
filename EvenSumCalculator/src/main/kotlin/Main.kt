// Proje Adı: EvenSumCalculator
// Verilen bir dizideki çift sayıların toplamını hesaplayan fonksiyon

fun ciftSayilarToplami(dizi: List<Int>): Int {
    var toplam = 0 // Çift sayıların toplamını tutacak değişken

    // Dizideki her elemanı kontrol et
    for (sayi in dizi) {
        if (sayi % 2 == 0) { // Eğer sayı çift ise
            toplam += sayi // Toplama ekle
        }
    }

    return toplam // Çift sayıların toplamını döndür
}

// Fonksiyonun çalışmasını test etmek için örnek kullanım
fun main() {
    val sayilar = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sonuc = ciftSayilarToplami(sayilar)

    println("Çift Sayıların Toplamı: $sonuc")
    // Çıktı: Çift Sayıların Toplamı: 30
}
