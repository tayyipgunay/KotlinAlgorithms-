class YabanciDilKitaplari(
    adi: String,
    yazar: String,
    basimYili: Int,
    sayfaSayisi: Int,
    ISBN: Double,
    private val exercise: Boolean
) : Kitaplar(adi, yazar, basimYili, sayfaSayisi, ISBN) {

    override fun fiyatArtisiUygula() {
        fiyat += fiyat * 0.15
        println("📈 Yabancı Dil Kitabı Fiyat Artışı Uygulandı: $fiyat TL")
    }

    override fun fiyatIndirimiUygula() {
        fiyat -= fiyat * 0.05
        println("📉 Yabancı Dil Kitabı Fiyat İndirimi Uygulandı: $fiyat TL")
    }
}
