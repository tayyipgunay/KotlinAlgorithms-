
fun main(args: Array<String>) {
    // Kullanıcıdan iki sayı alınır
    println("1. sayıyı girin")
    val sayi1 = readLine()?.toIntOrNull() ?: return // Kullanıcı geçerli bir sayı girmezse program sonlanır
    println("2. sayıyı girin")
    val sayi2 = readLine()?.toIntOrNull() ?: return // Kullanıcı geçerli bir sayı girmezse program sonlanır

    // Öklid algoritması kullanılarak EBOB hesaplanır
    val ebob = calculateEBOB(sayi1, sayi2)

    // EBOB kullanılarak EKOK hesaplanır
    val ekok = calculateEKOK(sayi1, sayi2, ebob)

    // Sonuçlar ekrana yazdırılır
    println("EBOB: $ebob")
    println("EKOK: $ekok")
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

// EKOK hesaplayan fonksiyon
fun calculateEKOK(sayi1: Int, sayi2: Int, ebob: Int): Int {
    return (sayi1 * sayi2) / ebob // EKOK = (sayı1 * sayı2) / EBOB formülü uygulanır
}



/*fun main(args: Array<String>) {
    // Kullanıcıdan iki sayı alınır
    println("1. sayıyı girin")
    val sayi1 = readLine()?.toIntOrNull() ?: return // Kullanıcı geçerli bir sayı girmezse program sonlanır
    println("2. sayıyı girin")
    val sayi2 = readLine()?.toIntOrNull() ?: return // Kullanıcı geçerli bir sayı girmezse program sonlanır

    // EKOK hesaplama fonksiyonu çağrılır
    CalculateEkok(sayi1, sayi2)
}

// İki sayının EKOK'unu hesaplayan fonksiyon
fun CalculateEkok(sayi1: Int, sayi2: Int) {
    var ekok = 1 // EBOB başlangıç değeri 1 olarak atanır
    var num1 = sayi1 // İlk sayı değişkeni
    var num2 = sayi2 // İkinci sayı değişkeni

    // 2'den başlayarak en büyük tamsayıya kadar döngü devam eder
    for (i in 2..Int.MAX_VALUE) {
        while (num1 % i == 0 || num2 % i == 0) { // Eğer sayıların biri i'ye bölünüyorsa
            ekok *= i // ekok çarpanı güncellenir
            if (num1 % i == 0) {
                num1 /= i // İlk sayı bölünerek küçültülür
            }
            if (num2 % i == 0) {
                num2 /= i // İkinci sayı bölünerek küçültülür
            }
        }
        // Eğer her iki sayı da 1 olmuşsa döngü sonlandırılır
        if (num1 == 1 && num2 == 1) {
            break
        }
    }

    // EKOK sonucu ekrana yazdırılır
    println("EKOK: $ekok")
}*/
