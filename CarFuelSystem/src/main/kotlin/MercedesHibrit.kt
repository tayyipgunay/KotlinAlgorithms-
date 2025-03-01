class MercedesHibrit(marka: String, model: String) : MercedesElektrikli(marka, model) {

    override fun yakitTipi() {
        println("🔋 $marka $model $arabaAdi hibrit araçlarımız mevcuttur.")
    }

    override fun yakitHacmi() {
        println("🛠️ $marka $model $arabaAdi hibrit farklı menzilli araçlarımız mevcuttur.")
    }

    override fun fiyatHesapla(): Double {
        fiyat += fiyat * 0.5 // Hibrit araçlar için %50 zam
        return fiyat
    }
}
