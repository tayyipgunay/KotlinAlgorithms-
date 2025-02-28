import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // 📌 Soru: İki sayının aralarında asal olup olmadığını belirleyen program
    // Kullanıcıdan iki sayı alınarak, ortak bölenleri olup olmadığı kontrol edilir.
    // Eğer ortak bölenleri yoksa "Aralarında asaldır" mesajı verilir,
    // en az bir ortak bölen bulunursa "Aralarında asal değil" mesajı verilir.

    print("1. sayıyı girin: ")
    val sayi1 = input.nextInt()
    print("2. sayıyı girin: ")
    val sayi2 = input.nextInt()

    var aralarindaAsal = true // Başlangıçta iki sayının aralarında asal olduğu varsayılır

    for (i in 2..minOf(sayi1, sayi2)) {
        if (sayi1 % i == 0 && sayi2 % i == 0) {
            aralarindaAsal = false
            break // Ortak bölen bulunduğu anda döngüden çık
        }
    }

    if (aralarindaAsal) {
        println("Aralarında asaldır")
    } else {
        println("Aralarında asal değil")
    }
}
