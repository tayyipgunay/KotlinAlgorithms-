fun main() {
    val kredi1 = IhtiyacKredisi(6, 10000.0)
    kredi1.krediTürü = "İhtiyaç Kredisi"
    kredi1.krediBilgileriniGoster()

    val kredi2 = TarimKredisi(7, 20000.0)
    kredi2.krediBilgileriniGoster()
}
