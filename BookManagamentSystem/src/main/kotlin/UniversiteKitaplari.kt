class UniversiteKitaplari(
    adi: String,
    basimYili: Int,
    sayfaSayisi: Int,
    ISBN: Double,
    yazar: String,
    private val isOrjinal: Boolean
) : Kitaplar(adi, yazar, basimYili, sayfaSayisi, ISBN) {

    override fun fiyatArtisiUygula() {
        fiyat += fiyat * 0.10
        println("📈 Üniversite Kitabı Fiyat Artışı Uygulandı: $fiyat TL")
    }

    override fun fiyatIndirimiUygula() {
        fiyat -= fiyat * 0.03
        println("📉 Üniversite Kitabı Fiyat İndirimi Uygulandı: $fiyat TL")
    }
}
