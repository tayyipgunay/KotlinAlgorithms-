import java.util.Scanner

// Bir sayının asal çarpanlarını bulan program
fun main() {
    val input = Scanner(System.`in`)

    // Kullanıcıdan sayı alınır
    print("Bir sayı girin: ")
    var sayi = input.nextInt()

    // Asal çarpanları ekrana yazdırmak için döngü
    for (i in 2..sayi) {
        while (sayi % i == 0) { // Sayı i'ye tam bölünüyorsa
            print("$i, ") // Çarpanı ekrana yazdır
            sayi /= i // Sayıyı bölerek devam et
        }
        if (sayi == 1) break // Sayı tamamen bölündüğünde işlemi sonlandır
    }
}
