import java.util.Scanner

fun main() {
    // 📌 Soru: Elmas Yıldız Deseni Oluşturma
    // Kullanıcıdan alınan bir sayı ile elmas deseni oluşturun.

    val input = Scanner(System.`in`)
    print("Bir sayı girin: ")
    var sayi = input.nextInt()
    var bosluk = sayi - 1
    var sembol = 1
    var tursayisi = 0
    val referans = (sayi + 1) / 2

    while (sayi >= 1) {
        for (j in 0 until bosluk) { // Boşlukları ekrana yazdır
            print(" ")
        }
        for (i in 0 until sembol) { // Yıldızları ekrana yazdır
            print("* ")
        }

        tursayisi++

        if (tursayisi >= referans) { // Elmasın alt kısmı
            sembol -= 2
            bosluk += 2
        } else { // Elmasın üst kısmı
            sembol += 2
            bosluk -= 2
        }

        println() // Yeni satıra geç
        sayi--
    }
}
