class MercedesBenzinli(marka: String, model: String) : Mercedes(marka, model) {
    override var fiyat: Double = 40000.0
   // init {
     //   fiyat=40000.0
    //}

    override fun yakitTipi() {
        println("⛽ $marka $model $arabaAdi benzinli yakıt türünde araçlarımız mevcuttur.")
    }

    override fun yakitHacmi() {
        println("🔋 $marka $model $arabaAdi benzinli 1.6 türünde araçlarımız mevcuttur.")
    }

    override fun fiyatHesapla(): Double {
        return fiyat + fiyat * 0.6
    }
}
