class Ogrenci(private var ogrenciAdi: String, private var ogrenciNo: Int, private var devamsizlikSayisi: Int = 0) {

    // Companion object, Kotlin’de `static` değişken ve fonksiyon yerine kullanılır
    companion object {
        private const val okul = "Fırat Üniversitesi"

        fun staticMetotCalis() {
            println("$okul statik metot ile çalışıyor çünkü okul değişkeni static olarak tanımlandı.")
        }
    }

    // Öğrenci bilgilerini ekrana yazdıran fonksiyon
    fun bilgiYaz() {
        println("Öğrenci Adı: $ogrenciAdi")
        println("Öğrenci No: $ogrenciNo")
        println("Devamsızlık Sayısı: $devamsizlikSayisi")
        println("Ceza Durumu: ${cezaHesapla()}")
        println("Okul: $okul")
    }

    // Devamsızlık durumuna göre ceza hesaplayan fonksiyon
    private fun cezaHesapla(): Boolean {
        return devamsizlikSayisi > 3
    }
}

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
