/*fun main(args: Array<String>) {
    // Kullanıcıdan iki sayı alınır
    println("1. sayıyı girin")
    var sayi1 = readLine()?.toIntOrNull() ?: return // Kullanıcı geçerli bir sayı girmezse program sonlanır
    println("2. sayıyı girin")
    var sayi2 = readLine()?.toIntOrNull() ?: return // Kullanıcı geçerli bir sayı girmezse program sonlanır

    // EBOB hesaplama fonksiyonu çağrılır
    CalculateEbob(sayi1, sayi2)
}

// İki sayının EBOB'unu hesaplayan fonksiyon
fun CalculateEbob(sayi1: Int, sayi2: Int) {
    var num1 = sayi1 // İlk sayı değişkeni
    var num2 = sayi2 // İkinci sayı değişkeni
    var ebob = 1 // En Büyük Ortak Bölen (EBOB) başlangıçta 1 olarak tanımlanır

    // 2'den başlayarak maksimum tamsayı değerine kadar kontrol edilir
    for (i in 2..Int.MAX_VALUE) {
        while (num1 % i == 0 && num2 % i == 0) { // Eğer iki sayı da i'ye tam bölünüyorsa
            ebob *= i // EBOB değerine çarpan eklenir
            num1 /= i // İlk sayı bölünerek küçültülür
            num2 /= i // İkinci sayı bölünerek küçültülür
        }

        // Eğer i sayi1 veya sayi2'ye eşit veya büyükse döngüyü sonlandır
        if (i >= num2 || i >= num1) {
            break
        }
    }

    // Sonuç ekrana yazdırılır
    println("EBOB: $ebob")
}*/
fun main() {
    // Kullanıcıdan iki sayı alınır
    println("Birinci sayıyı girin:")
    val sayi1 = readLine()?.toIntOrNull() ?: return // Kullanıcı geçerli bir sayı girmezse program sonlanır

    println("İkinci sayıyı girin:")
    val sayi2 = readLine()?.toIntOrNull() ?: return // Kullanıcı geçerli bir sayı girmezse program sonlanır

    // Öklid algoritması ile EBOB hesaplanır
    val ebob = hesaplaEBOB(sayi1, sayi2)

    // Sonuç ekrana yazdırılır
    println("EBOB($sayi1, $sayi2) = $ebob")
}

/**
 * İki sayının En Büyük Ortak Bölenini (EBOB) hesaplayan fonksiyon.
 * Öklid algoritmasını kullanır.
 */
fun CalculateEbob(buyukSayi: Int, kucukSayi: Int): Int {
    var sayi1 = buyukSayi // İlk sayıyı saklayan değişken
    var sayi2 = kucukSayi // İkinci sayıyı saklayan değişken

    println("EBOB hesaplama adımları:")
    
    // Kalan sıfır olana kadar döngü devam eder
    while (sayi2 != 0) {
        val kalan = sayi1 % sayi2 // Büyük sayının küçük sayıya bölümünden kalan
        println("$sayi1 ÷ $sayi2 = ${sayi1 / sayi2}, kalan: $kalan") // Bölüm ve kalan gösterilir

        // Sayıları güncelle
        sayi1 = sayi2 // Küçük sayıyı yeni büyük sayı yap
        sayi2 = kalan // Kalanı yeni küçük sayı yap
    }

    // Döngü bittiğinde sayi1 değişkeni EBOB olur
    return sayi1
}


