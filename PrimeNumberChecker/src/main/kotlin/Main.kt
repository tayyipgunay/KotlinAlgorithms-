import java.lang.Math.sqrt

fun main(args: Array<String>) {
    print("Bir sayı giriniz: ")
    val sayi = readLine()?.toIntOrNull() ?: return // Kullanıcı geçerli bir sayı girmezse program sonlanır
    AsalKontrol(sayi) // Girilen sayının asal olup olmadığını kontrol eden fonksiyon çağrılıyor
}

fun AsalKontrol(sayı: Int) {


    var asalmı = true // Sayının asal olup olmadığını belirlemek için değişken

    // Sayının asal olup olmadığını kontrol etmek için sadece 2 ile sqrt(sayı) arasındaki sayılar kontrol edilir
    // Çünkü asal sayıların çarpanları simetriktir ve en büyük çarpan sqrt(sayı)'den küçük veya eşit olmalıdır
    for (i in 2..sqrt(sayı.toDouble()).toInt()) {
        if (sayı % i == 0) { // Eğer sayı herhangi bir değere tam bölünüyorsa asal değildir
            asalmı = false
            break // Döngüyü kırarak gereksiz kontrolleri önler
        }
    }

    // Sonuç ekrana yazdırılır
    if (asalmı) {
        print("$sayı sayısı asaldır.")
    } else {
        print("$sayı sayısı asal değildir.")
    }
}

// Verilen sayının asal olup olmadığını kontrol eden fonksiyon
/*fun AsalKontrol(sayı: Int) {
    var asalmı = true // Sayının asal olup olmadığını belirlemek için değişken

    // 2'den başlayarak girilen sayıya kadar olan sayıları kontrol eder
    for (i in 2 until  sayı){

        if (sayı % i == 0) { // Eğer sayı herhangi bir değere tam bölünüyorsa asal değildir
            asalmı = false
            break // Döngüyü kırarak gereksiz kontrolleri önler
        }
    }

    // Sonuç ekrana yazdırılır
    if (asalmı) {
        print("$sayı sayısı asaldır.")
    } else {
        print("$sayı sayısı asal değildir.")
    }
}*/