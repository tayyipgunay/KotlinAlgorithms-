open class Kitaplar(
    val adi: String,
    protected val yazar: String,
    protected val basimYili: Int,
    protected val sayfaSayisi: Int,
    val ISBN: Double
) {
    var fiyat: Double = 0.0

    fun kdvHesapla(): Double {
        return fiyat + fiyat * 0.18
    }

    open fun fiyatArtisiUygula() {
        fiyat += fiyat * 0.10
        println("📈 Fiyat Artışı Uygulandı: $fiyat TL")
    }

    open fun fiyatIndirimiUygula() {
        fiyat -= fiyat * 0.03
        println("📉 Fiyat İndirimi Uygulandı: $fiyat TL")
    }
}
