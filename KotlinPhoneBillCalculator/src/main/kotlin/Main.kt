import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // 📌 Soru: Telefon faturası hesaplama programı
    // Kullanıcıdan yaptığı çağrı süresini dakika cinsinden alınız.
    // - İlk 100 dakika ücretsizdir (200 TL sabit ücret alınır).
    // - 100 - 150 dakika arası: 0.6 TL/dk
    // - 150 - 200 dakika arası: 0.5 TL/dk
    // - 200 dakikadan sonrası: 0.4 TL/dk
    // Kullanıcının toplam faturasını hesaplayıp ekrana yazdırınız.

    print("Kaç dakika konuştunuz? ")
    val cagri = input.nextInt()
    val referans = cagri.toDouble()
    val ekstraDakikalar = referans - 200
    var ekUcret = 0.0

    // 200 dakikadan fazla konuşulursa 0.4 TL ek ücret uygulanır
    if (referans > 200) {
        ekUcret = ekstraDakikalar * 0.4
    }

    if (cagri <= 100) {
        println("Toplam fatura: 200 TL")
    } else {
        var kalanCagri = cagri - 100

        if (kalanCagri <= 50) {
            val hesap1 = kalanCagri * 0.6
            println("Toplam fatura: ${200 + hesap1} TL")
        } else {
            val hesap2 = 50 * 0.6
            kalanCagri -= 50
            val hesap3 = kalanCagri * 0.5

            val toplamFatura = 200 + hesap2 + hesap3 + ekUcret
            println("Toplam fatura: $toplamFatura TL")
        }
    }
}
