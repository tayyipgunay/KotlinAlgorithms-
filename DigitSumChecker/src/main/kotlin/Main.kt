import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // Kullanıcıdan sayı alınır
    print("Bir sayı girin: ")
    var sayi = input.nextInt()

    var basamakSayisi = 0 // Basamak sayısını tutar
    var basamakToplami = 0 // Basamakların toplamını tutar
    var tempSayi = sayi // Geçici değişken ile işlemler yapılır

    // Sayının basamaklarını hesaplayan döngü
    while (tempSayi != 0) {
        val basamak = tempSayi % 10 // Son basamağı alır
        basamakToplami += basamak // Basamak toplamına ekler
        tempSayi /= 10 // Sayıyı bir basamak küçültür
        basamakSayisi++ // Basamak sayısını arttırır
    }

    // Basamak sayısı ekrana yazdırılır
    println("Sayı $basamakSayisi basamaklıdır")

    // Basamak sayısı ile basamak toplamı eşitse ekrana mesaj yazdırılır
    if (basamakToplami == basamakSayisi) {
        println("Ve sayının basamak sayısı basamakları toplamına eşittir")
    }
}
