class TeknikPersonel(
    isim: String,
    soyisim: String,
    private val gorevlendirmeUcreti: Double,
    mesai: Int
) : IsciSinifi(isim, soyisim, mesai) {

    init {
        setEkUcret(gorevlendirmeUcretiHesapla(mesai, gorevlendirmeUcreti))
        println("\n------------------------")
        println("🔬 Teknik Personel Oluşturuldu!")
    }

    private fun gorevlendirmeUcretiHesapla(mesai: Int, gorevlendirmeUcreti: Double): Double {
        return (mesai * 100) + gorevlendirmeUcreti
    }
}
