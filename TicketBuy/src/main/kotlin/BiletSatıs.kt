class BiletSatis(
    private val yolcuAdSoyad: String,
    private val yolcuTC: Int,
    private val ekBagajVarMi: Boolean,
    private val ekBagajSayisi: Int,
    private val alacagimKoltukSayisi: Int,
    val firmaAdi: String = "SÜHA", // Varsayılan firma adı
    val seferNo: Int = 456, // Varsayılan sefer numarası
    val aracPlaka: String = "33V 30203" // Varsayılan araç plakası
) {
    private val biletFiyat: Int = 100
    private val aracKapasite: Int = 50
    private var bosKoltukSayisi: Int = 30
    private var ucret: Double = 0.0

    // Bilet satışı işlemi
    fun biletSat() {
        println("\n🎫 Bilet Satış İşlemi Başlatılıyor...")

        if (koltukKontrol(alacagimKoltukSayisi)) {
            println("💰 Ücret hesaplanıyor...")
            ucretHesapla()
            koltukGuncelle()
            islemOzeti()
        } else {
            println("❌ Yeterli boş koltuk bulunmamaktadır!")
        }
    }

    // Koltuk kontrol işlemi
    private fun koltukKontrol(alacagimKoltukSayisi: Int): Boolean {
        return alacagimKoltukSayisi <= bosKoltukSayisi
    }

    // Ücret hesaplama fonksiyonu
    private fun ucretHesapla() {
        ucret = alacagimKoltukSayisi * biletFiyat + if (ekBagajVarMi) ekBagajSayisi * 50 else 0
    }

    // Koltuk güncelleme işlemi
    private fun koltukGuncelle() {
        bosKoltukSayisi -= alacagimKoltukSayisi
    }

    // İşlem özetini yazdıran fonksiyon
    private fun islemOzeti() {
        println("\n📋 İşlem Özeti:")
        println("👤 Yolcu: $yolcuAdSoyad")
        println("🆔 TC: $yolcuTC")
        println("🪑 Aldığı Koltuk Sayısı: $alacagimKoltukSayisi")
        println("💵 Ödediği Ücret: $ucret TL")
        println("🚍 Kalan Boş Koltuk: $bosKoltukSayisi")
        println("🏢 Firma: $firmaAdi")
        println("🚘 Araç Plaka: $aracPlaka")
        println("🔢 Sefer No: $seferNo")
    }
}
