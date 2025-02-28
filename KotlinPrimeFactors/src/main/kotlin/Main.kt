import java.util.Scanner

// Bir sayının asal çarpanlarını bulan program
fun main() {
    val input = Scanner(System.`in`)

    // Kullanıcıdan sayı alınır
    print("Bir sayı girin: ")
    var sayi = input.nextInt()

    // 2'den başlayarak asal çarpanları bul
    for (i in 2..sayi) {
        if (sayi % i == 0) { // Eğer i, sayının bir çarpanıysa
            println(i) // Çarpanı ekrana yazdır
        }
        while (sayi % i == 0) { // Sayı i'ye bölünebildiği sürece bölmeye devam et
            sayi /= i
        }
        if (sayi == 1) break // Sayı tamamen bölündüğünde işlemi sonlandır
    }
}
