fun main() {
    // 📌 Soru: Yıldız Deseni ile Piramit Oluşturma
    // Yıldızları ve boşlukları kullanarak simetrik bir piramit oluşturun.

    var sembol = 9 // Başlangıçta 9 boşluk

    while (sembol > 0) {
        for (i in 0 until sembol) { // Boşlukları ekrana yazdır
            print(" ")
        }
        for (j in 10 downTo sembol + 1) { // Yıldızları yazdır (ortaya hizalanmış şekilde)
            print("* ")
        }
        println() // Yeni satıra geç
        sembol-- // Boşluk sayısını azaltarak piramit oluştur
    }
}
