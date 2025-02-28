import kotlin.math.sqrt

// Kullanıcıdan giriş almak için Kotlin'in readLine() fonksiyonu kullanılıyor
fun main() {
    print("İlk kaç asal sayıyı istiyorsunuz: ")
    val sayi = readLine()?.toIntOrNull() ?: return // Kullanıcı geçerli bir sayı girmezse program sonlanır

    // Belirtilen sayı kadar asal sayı üreten fonksiyon çağrılıyor
    ASALL(sayi)
}

// Verilen sayıya kadar asal sayıları bulan fonksiyon
fun ASALL(sayi: Int) {
    var sayac = 0 // Bulunan asal sayıları saymak için sayaç
    var i = 2 // Asal sayıları kontrol etmeye 2'den başlanır

    while (sayac != sayi) { // Belirtilen kadar asal sayı bulunana kadar devam eder
        var asalMi = true // Sayının asal olup olmadığını kontrol etmek için değişken
        for (j in 2..sqrt(i.toDouble()).toInt()) { // Sayının asal olup olmadığını kontrol etmek için
            // sadece 2 ile sqrt(i) arasındaki sayılar kontrol edilir
// Çünkü asal sayıların çarpanları simetriktir ve en büyük çarpan sqrt(i)'den küçük veya eşit olmalıdır

            if (i % j == 0) { // Eğer sayı herhangi bir değere tam bölünüyorsa asal değildir
                asalMi = false
                break // Döngüyü kırarak gereksiz kontrolleri önler
            }
        }
        if (asalMi) { // Eğer sayı asalsa ekrana yazdır ve sayaç arttır
            println(i)
            sayac++
        }
        i++ // Bir sonraki sayıya geç
    }
}
