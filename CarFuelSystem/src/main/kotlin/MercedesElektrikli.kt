open class MercedesElektrikli(marka: String, model: String) : Mercedes(marka, model) {

    override fun yakitTipi() {
        println("⚡ $marka $model $arabaAdi elektrikli araçlarımız mevcuttur.")
    }

    override fun yakitHacmi() {
        println("🔌 $marka $model $arabaAdi elektrikli farklı menzilli araçlarımız mevcuttur.")
    }

    override fun fiyatHesapla(): Double {
        fiyat += fiyat * 0.8
        return fiyat
    }
}
