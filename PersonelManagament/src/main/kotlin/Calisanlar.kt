open class Calisanlar(
    val isim: String,
    val soyisim: String
) {
    var departman: String = ""
    var yillikIzinSayisi: Int = 20
    private var ekUcret: Double = 0.0
    var maas: Double = 5000.0

    fun getEkUcret(): Double = ekUcret
    fun setEkUcret(ekUcret: Double) {
        this.ekUcret = ekUcret
    }

    // Maaş hesaplama fonksiyonu
    fun maasHesapla(): Double {
        return maas + ekUcret
    }

    // Çalışan bilgilerini yazdırma fonksiyonu
    fun bilgileriYazdir() {
        println("\n-----------------------------")
        println("👤 İsim: $isim")
        println("🆔 Soyisim: $soyisim")
        println("💰 Toplam Maaş: ${maasHesapla()} TL")
        println("🏢 Departman: $departman")
        println("📅 Yıllık İzin Sayısı: $yillikIzinSayisi")
    }
}
