import java.util.Scanner

// Global değişken yerine fonksiyon bazlı değişken kullanarak daha iyi bir yapı oluşturduk
fun main() {
    val input = Scanner(System.`in`)

    // Kullanıcıya giriş mesajı veriyoruz
    println("Lütfen birinci sayıyı giriniz:")
    val sayi = input.nextInt()

    println("Lütfen ikinci sayıyı giriniz:")
    val sayi2 = input.nextInt()

    // Sonucu kontrol edip ekrana yazdırıyoruz
    durumYazdir(kontrolOnay(sayi, sayi2))
    // birleştirip yazacaksak void metounda parantez içi dolu olmalı
}

// İki sayının aralarında asal olup olmadığını kontrol eden fonksiyon
fun kontrolOnay(sayi: Int, sayi2: Int): Boolean {
    var kontrol = false

    // En küçük sayı kadar döngü çalıştırarak en büyük ortak böleni kontrol ediyoruz
    val limit = if (sayi < sayi2) sayi else sayi2

    for (i in 2..limit) { // 2'den itibaren tüm sayıları deniyoruz
        if (sayi % i == 0 && sayi2 % i == 0) {
            kontrol = true
            break
        }
    }

    return kontrol
}

// Kontrol sonucuna göre ekrana mesaj yazdıran fonksiyon
fun durumYazdir(kontrolSonucu: Boolean) {
    if (kontrolSonucu) {
        println("Girilen sayılar aralarında asal değildir.")
    } else {
        println("Girilen sayılar aralarında asaldır.")
    }
}
