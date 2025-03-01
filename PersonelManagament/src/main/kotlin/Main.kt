fun main() {
    val genelMudur = GenelMudurluk("Tayyip", "Günay", 10.0)
    genelMudur.departman = "Bilgi İşlem"
    genelMudur.bilgileriYazdir()

    val isci = IsciSinifi("Ayşe", "Yılmaz", 2)
    isci.departman = "İşçi"
    isci.bilgileriYazdir()

    val teknikPersonel = TeknikPersonel("Ahmet", "Yılmaz", 15.0, 2)
    teknikPersonel.departman = "Teknik Personel"
    teknikPersonel.bilgileriYazdir()
}
