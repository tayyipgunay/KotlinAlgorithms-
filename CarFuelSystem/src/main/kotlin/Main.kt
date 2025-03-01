fun main() {
    val c1 = MercedesBenzinli("2023", "Mercedes")
    c1.yakitTipi()
    c1.yakitHacmi()
    println("💰 Fiyat: ${c1.fiyatHesapla()} TL")

    val c2 = MercedesDizel("Mercedes", "2023")
    c2.yakitTipi()
    c2.yakitHacmi()
    println("💰 Fiyat: ${c2.fiyatHesapla()} TL")
    println("🔹 Ana Sınıftan Gelen Fiyat: ${c2.fiyat} TL")
}
