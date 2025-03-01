import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // Kullanıcıya giriş bilgisi veriyoruz
    println("Lütfen iki adet yarıçap değeri giriniz (0'dan büyük olmalıdır):")

    // Kullanıcıdan yarıçap değerlerini al
    var yaricap = input.nextDouble()
    var yaricap2 = input.nextDouble()

    // Yarıçapın 0 veya negatif olmaması için kontrol sağlanıyor
    while (yaricap <= 0 || yaricap2 <= 0) {
        println("Hata: Yarıçap 0'dan büyük olmalıdır. Lütfen geçerli bir değer giriniz.")

        if (yaricap <= 0) {
            println("Yarıçap 1 için yeni değer girin:")
            yaricap = input.nextDouble()
        }
        if (yaricap2 <= 0) {
            println("Yarıçap 2 için yeni değer girin:")
            yaricap2 = input.nextDouble()
        }
    }

    // Cember sınıfı ile daire hesaplamaları yapılıyor
    val c1 = Cember(yaricap)
    c1.cevreHesapla()
    c1.alanHesapla()

    val c2 = Cember(yaricap2)
    c2.cevreHesapla()
    c2.alanHesapla()
}
