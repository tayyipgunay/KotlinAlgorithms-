import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    println("✈️  Bilet Satış Sistemine Hoş Geldiniz! ✈️")
    print("Adınızı ve Soyadınızı Giriniz: ")
    val adSoyad = input.nextLine()

    print("TC Kimlik Numaranızı Giriniz: ")
    val tc = try {
        input.nextInt()
    } catch (e: Exception) {
        println("⚠ Geçersiz giriş! Varsayılan TC atanıyor: 1234567890")
        1234567890
    }

    print("Ek bagajınız var mı? (true/false): ")
    val ekBagajVarMi = input.nextBoolean()

    print("Ne kadar ek bagajınız var?: ")
    val ekBagajSayisi = input.nextInt()

    print("Kaç koltuk istiyorsunuz?: ")
    val alacagimKoltukSayisi = input.nextInt()

    // Kullanıcıdan firma adı alma (Opsiyonel)
    print("Bilet almak istediğiniz firma adı (Varsayılan: SÜHA): ")
    input.nextLine() // Önceki input'tan kalan satırı temizleme
    val firmaAdi = input.nextLine().ifBlank { "SÜHA" }

    // Bilet Satış İşlemi Başlatılıyor
    val bilet = BiletSatis(adSoyad, tc, ekBagajVarMi, ekBagajSayisi, alacagimKoltukSayisi, firmaAdi = firmaAdi)
    bilet.biletSat()
}
