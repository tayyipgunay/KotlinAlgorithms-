fun main() {
    // 📌 Soru: Azalan Yıldız Deseni
    // 9 yıldızdan başlayarak her satırda bir yıldız eksilterek üçgen şekli oluşturun.

    var sembol = 9 // Başlangıçta 9 yıldız

    while (sembol >= 0) { // Yıldız sayısı 0 olana kadar devam eder
        for (j in 0 until sembol) { // Yıldızları ekrana yazdır
            print("* ")
        }
        println() // Yeni satıra geç
        sembol-- // Yıldız sayısını azalt
    }
}
