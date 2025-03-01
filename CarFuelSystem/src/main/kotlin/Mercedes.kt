open class Mercedes(
    var marka: String,
    var model: String
) {
    protected var arabaAdi: String = "Binek"
    open var fiyat: Double = 200000.0

    open fun yakitTipi() {
        println("⚙️ $model $marka $arabaAdi çeşitli yakıt türlerine ait araçlarımız mevcuttur.")
    }

    open fun yakitHacmi() {
        println("🚗 $model $marka $arabaAdi çeşitli motor hacimlerine ait araçlarımız mevcuttur.")
    }

    open fun fiyatHesapla(): Double {
        return fiyat + fiyat * 0.8
    }
}
