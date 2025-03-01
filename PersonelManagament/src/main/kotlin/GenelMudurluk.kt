class GenelMudurluk(
    isim: String,
    soyisim: String,
    gorevlendirmeUcreti: Double
) : Calisanlar(isim, soyisim) {

    init {
        setEkUcret(gorevlendirmeUcreti)
        departman = "Bilgi İşlem"
        println("\n--------------------------")
        println("🏢 Genel Müdürlük Personeli Oluşturuldu!")
    }
}
