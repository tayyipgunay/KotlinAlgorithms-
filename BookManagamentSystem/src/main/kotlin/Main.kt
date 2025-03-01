fun main() {
    val kitap1 = Kitaplar("Kitap 1", "Yazar 1", 2023, 50, 123456.0)
    kitap1.fiyat = 100.0
    println("📚 KDV'siz Fiyat: ${kitap1.fiyat} TL")
    println("📈 KDV'li Fiyat: ${kitap1.kdvHesapla()} TL")
    kitap1.fiyatArtisiUygula()
    kitap1.fiyatIndirimiUygula()
    println("-----------------------------------")

    val kitap2 = UniversiteKitaplari("Kitap 2", 2024, 55, 550.05, "Yazar 2", true)
    kitap2.fiyat = 100.0
    println("📚 KDV'siz Fiyat: ${kitap2.fiyat} TL")
    println("📈 KDV'li Fiyat: ${kitap2.kdvHesapla()} TL")
    kitap2.fiyatArtisiUygula()
    kitap2.fiyatIndirimiUygula()
    println("---------------------------")

    val kitap3 = BoyamaKitaplari("Kitap 3", "Yazar 3", 2026, 56, 1354.0, "15-5")
    kitap3.fiyat = 100.0
    println("📚 KDV'siz Fiyat: ${kitap3.fiyat} TL")
    println("📈 KDV'li Fiyat: ${kitap3.kdvHesapla()} TL")
    kitap3.fiyatArtisiUygula()
    println("----------------------------")

    val kitap4 = PastelBoyamaKitaplari("Kitap 4", "Yazar 4", 2026, 56, 123.0, "14-3")
    kitap4.fiyat = 100.0
    println("📚 KDV'siz Fiyat: ${kitap4.fiyat} TL")
    println("📈 KDV'li Fiyat: ${kitap4.kdvHesapla()} TL")
    kitap4.fiyatArtisiUygula()
    println("--------------------------------")
}
