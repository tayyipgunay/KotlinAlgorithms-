// Proje Adı: OddNumberGenerator
// Belirli bir aralıktaki tüm tek sayıları içeren bir liste oluşturan fonksiyon
// Başlangıç ve bitiş değerleri kullanıcı tarafından sağlanmalıdır

fun tekSayilariOlustur(baslangic: Int, bitis: Int): List<Int> {
    val tekSayilar = mutableListOf<Int>() // Boş bir liste oluşturuluyor

    // Belirtilen aralıkta döngü ile ilerleyerek tek sayıları ekliyoruz
    for (sayi in baslangic..bitis) {
        if (sayi % 2 != 0) { // Eğer sayı tek ise listeye ekleniyor
            tekSayilar.add(sayi)
        }
    }

    return tekSayilar // Tek sayılar içeren liste döndürülüyor
}

// Fonksiyonun çalışmasını test etmek için örnek kullanım
fun main() {
    val baslangic = 10
    val bitis = 25

    val tekSayilar = tekSayilariOlustur(baslangic, bitis)

    println("Belirtilen aralıktaki tek sayılar: $tekSayilar")
    // Çıktı: Belirtilen aralıktaki tek sayılar: [11, 13, 15, 17, 19, 21, 23, 25]
}
