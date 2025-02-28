// Bir dizideki çift sayıları bulan ve bunları bir listeye ekleyen bir Kotlin fonksiyonu

fun ciftSayilariBul(dizi: List<Int>): List<Int> {
    // Yeni bir liste oluşturuluyor
    val ciftSayilar = mutableListOf<Int>()

    // Dizinin elemanları tek tek kontrol ediliyor
    for (sayi in dizi) {
        // Eğer sayı 2'ye tam bölünüyorsa, çift sayıdır ve listeye eklenir
        if (sayi % 2 == 0) {
            ciftSayilar.add(sayi)
        }
    }
    // Çift sayılar içeren liste döndürülüyor
    return ciftSayilar
}

// Fonksiyonun çalışmasını test etmek için bir örnek
fun main() {
    val sayilar = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sonuc = ciftSayilariBul(sayilar)
    println("Çift Sayılar: $sonuc") // Çıktı: Çift Sayılar: [2, 4, 6, 8, 10]
}
