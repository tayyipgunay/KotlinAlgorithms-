open class IsciSinifi(
    isim: String,
    soyisim: String,
    private val mesai: Int
) : Calisanlar(isim, soyisim) {

    init {
        setEkUcret(mesaiUcretiHesapla(mesai))
        println("\n--------------------------")
        println("🔧 İşçi Sınıfı Personeli Oluşturuldu!")
    }

    private fun mesaiUcretiHesapla(mesai: Int): Double {
        return mesai * 100.0
    }
}
