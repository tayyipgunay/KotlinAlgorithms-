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
fun main(args: Array<String>) {
    // Kullanıcıdan iki sayı alınır
    println("1. sayıyı girin")
    val sayi1 = readLine()?.toIntOrNull() ?: return // Kullanıcı geçerli bir sayı girmezse program sonlanır
    println("2. sayıyı girin")
    val sayi2 = readLine()?.toIntOrNull() ?: return // Kullanıcı geçerli bir sayı girmezse program sonlanır

    // Öklid algoritması kullanılarak EBOB hesaplanır
    val ebob = calculateEBOB(sayi1, sayi2)

    // Sonuç ekrana yazdırılır
    println("EBOB: $ebob")
}

// Öklid algoritması kullanılarak iki sayının EBOB'unu hesaplayan fonksiyon
fun calculateEBOB(sayi1: Int, sayi2: Int): Int {
    var num1 = sayi1 // İlk sayı değişkeni
    var num2 = sayi2 // İkinci sayı değişkeni

    // Öklid algoritması: İki sayının mod işlemi sonucu ile tekrar eden bölme işlemi
    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    return num1 // EBOB sonucu döndürülür
}

