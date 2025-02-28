import java.util.Scanner

fun main() {
    // 📌 Soru: Üçgen Yıldız Deseni Oluşturma
    // Kullanıcıdan alınan bir sayı ile üçgen yıldız deseni oluşturun.

    val input = Scanner(System.`in`)
    print("Bir sayı girin: ")
    var sayi = input.nextInt()
    var sembol = 1
    var bosluk = (sayi - 1) * 2 // Başlangıçtaki boşluk miktarı

    while (sayi >= 1) {
        for (i in 0 until bosluk) { // Boşlukları ekrana yazdır
            print(" ")
        }
        for (j in 0 until sembol) { // Yıldızları ekrana yazdır
            print("* ")
        }
        println() // Yeni satıra geç

        bosluk -= 2 // Boşluğu azalt
        sembol++ // Yıldız sayısını artır
        sayi--
    }
}
