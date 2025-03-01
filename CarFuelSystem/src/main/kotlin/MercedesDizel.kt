class MercedesDizel(marka: String, model: String) : Mercedes(marka, model) {
    override var fiyat: Double = 5000.0

    override fun yakitTipi() {
        println("🛢️ $marka $model $arabaAdi dizel yakıt türünde araçlarımız mevcuttur.")
    }

    override fun yakitHacmi() {
        println("🚜 $marka $model $arabaAdi dizel 1.8 türünde araçlarımız mevcuttur.")
    }

    override fun fiyatHesapla(): Double {
        fiyat *= 0.8
        return fiyat
    }
}
