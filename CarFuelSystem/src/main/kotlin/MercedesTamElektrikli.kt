class MercedesTamElektrikli(marka: String, model: String) : MercedesElektrikli(marka, model) {

    override fun yakitTipi() {
        println("⚡ $marka $model $arabaAdi tam elektrikli araçlarımız mevcuttur.")
    }

    override fun yakitHacmi() {
        println("🔋 $marka $model $arabaAdi tam elektrikli farklı menzilli araçlarımız mevcuttur.")
    }
}
