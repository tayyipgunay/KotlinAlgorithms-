class TarimKredisi(vadeSayisi: Int, krediTutari: Double) : KrediTurleri(vadeSayisi, krediTutari) {

    init {
        krediTürü = "Tarım Kredisi"
        verilenKredi = "Gübre Kredisi"
        faizOrani = 6.0
        println("\n------------------------")
        println("🌾 Tarım Kredisi Oluşturuldu!")
    }
}
