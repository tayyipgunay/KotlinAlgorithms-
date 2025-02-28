import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // Kullanıcıdan sayı alınır
    print("Bir sayı girin: ")
    val sayi = input.nextInt()

    // Faktöriyel hesaplama fonksiyonu çağrılır
    val sonuc = faktoriyelHesapla(sayi)

    // Sonuç ekrana yazdırılır
    println("$sayi! = $sonuc")
}

// Faktöriyel hesaplayan fonksiyon
fun faktoriyelHesapla(n: Int): Long {
    var sonuc = 1L // Faktöriyel değerini saklamak için değişken (Long kullanıldı büyük sayılar için)
    for (i in 1..n) {
        sonuc *= i
    }
    return sonuc
}
