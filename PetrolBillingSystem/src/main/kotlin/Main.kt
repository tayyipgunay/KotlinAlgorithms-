import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // 📌 Soru: Petrol fiyatı hesaplama programı
    // Kullanıcıdan kaç litre petrol alacağını girmesini isteyin.
    // Fiyatlandırma şu şekildedir:
    // - 0-50 litre: 4 TL / litre
    // - 51-100 litre: 7 TL / litre
    // - 101-150 litre: 9 TL / litre
    // - 151-200 litre: 11 TL / litre
    // - 201 litre ve üzeri: 15 TL / litre
    // Kullanıcının toplam ödeyeceği tutarı hesaplayarak ekrana yazdırınız.

    print("Petrol kaç litre? ")
    val petrol = input.nextInt()
    var hesap = 0.0

    if (petrol <= 50) {
        hesap = petrol * 4.0
    } else if (petrol <= 100) {
        hesap = (50 * 4) + (petrol - 50) * 7.0
    } else if (petrol <= 150) {
        hesap = (50 * 4) + (50 * 7) + (petrol - 100) * 9.0
    } else if (petrol <= 200) {
        hesap = (50 * 4) + (50 * 7) + (50 * 9) + (petrol - 150) * 11.0
    } else {
        hesap = (50 * 4) + (50 * 7) + (50 * 9) + (50 * 11) + (petrol - 200) * 15.0
    }

    // Toplam tutar ekrana yazdırılır
    println("Toplam fiyat: $hesap TL")
}
