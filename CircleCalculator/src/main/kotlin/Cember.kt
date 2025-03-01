// Cember sınıfı, daire ile ilgili hesaplamaları içeriyor
class Cember(private val r: Double) {

    // Çevre hesaplama fonksiyonu
    fun cevreHesapla() {
        val cevre = 2 * 3.14 * r
        println("Çevre: $cevre")
    }

    // Alan hesaplama fonksiyonu
    fun alanHesapla() {
        val alan = 3.14 * r * r
        println("Alan: $alan")
    }
}