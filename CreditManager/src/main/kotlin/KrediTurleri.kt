open class KrediTurleri(
    protected val vadeSayisi: Int,
    private val krediTutari: Double
) {
    var verilenKredi: String = ""
    var krediTürü: String = ""
    protected open var faizOrani: Double = 0.0

    // Ödenecek tutarı hesaplayan fonksiyon
    fun odenecekTutar(): Double {
        return krediTutari * faizOrani / 100 * vadeSayisi + krediTutari
    }

    // Kredi bilgilerini gösteren fonksiyon
    fun krediBilgileriniGoster() {
        println("\n📌 Kredi Bilgileri:")
        println("📋 Verilen Kredi: $verilenKredi")
        println("🏦 Kredi Türü: $krediTürü")
        println("📅 Vade Sayısı: $vadeSayisi")
        println("💲 Faiz Oranı: $faizOrani%")
        println("💰 Kredi Tutarı: $krediTutari TL")
        println("✅ Ödenecek Tutar: ${odenecekTutar()} TL")
    }
}
