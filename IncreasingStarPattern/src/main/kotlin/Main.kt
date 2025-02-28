fun main() {
    // 📌 Soru: Artan Yıldız Deseni Oluşturma
    // 1 yıldızdan başlayarak her satırda bir yıldız ekleyerek üçgen şekli oluşturun.

    var sembol = 1 // Başlangıçta 1 yıldız

    while (sembol <= 9) { // Her döngüde satırdaki yıldız sayısını artır
        for (i in 0 until sembol) { // Yıldızları ekrana yazdır
            print("*")
        }
        println() // Yeni satıra geç
        sembol++ // Yıldız sayısını artır
    }
}
