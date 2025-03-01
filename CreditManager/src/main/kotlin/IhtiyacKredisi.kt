class IhtiyacKredisi(vadeSayisi: Int, krediTutari: Double) : KrediTurleri(vadeSayisi, krediTutari) {

    // Kotlin'de `super` yerine `init` bloğu kullanılarak değişkenler set edildi
    init {
        krediTürü = "İhtiyaç Kredisi"
        verilenKredi = "Araba Kredisi"
        faizOrani = 5.0
        println("\n--------------------------")
        println("🚗 İhtiyaç Kredisi Oluşturuldu!")
    }
}
