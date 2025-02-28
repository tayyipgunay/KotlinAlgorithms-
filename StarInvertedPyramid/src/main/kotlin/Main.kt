fun main() {
    // 📌 Soru: Ters Üçgen Yıldız Deseni
    // Yıldızları ve boşlukları kullanarak ters üçgen deseni oluşturun.

    var sembol = 1 // Başlangıç değeri

    while (sembol <= 9) { // 9 satıra kadar devam eder
        for (i in 1 until sembol) { // Boşlukları ekrana yazdır
            print(" ")
        }
        for (j in 9 downTo sembol + 1) { // Yıldızları yazdır (sağa hizalanmış şekilde)
            print("*")
        }
        println() // Yeni satıra geç
        sembol++ // Her satırda sembol değerini artır
    }
}
