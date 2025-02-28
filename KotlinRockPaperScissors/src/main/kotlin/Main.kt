import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val diziler = arrayOf("taş", "kağıt", "makas")

    // 📌 Soru: Taş-Kağıt-Makas oyunu
    // Kullanıcıdan 0=taş, 1=kağıt, 2=makas seçeneklerinden birini girmesini isteyin.
    // Bilgisayar rastgele bir seçim yapacaktır.
    // Kurallar:
    // - Taş (0) makası (2) yener
    // - Kağıt (1) taşı (0) yener
    // - Makas (2) kağıdı (1) yener
    // - İki seçim aynıysa oyun berabere biter
    // Kullanıcının kazanıp kazanmadığını ekrana yazdırınız.

    print("0=taş, 1=kağıt, 2=makas seçin birini: ")
    val pc = (0..2).random() // Bilgisayarın rastgele seçimi
    val ben = input.nextInt()

    println("Ben: ${diziler[ben]}")
    println("PC: ${diziler[pc]}")

    when {
        ben == pc -> println("Berabere")
        (ben == 0 && pc == 2) || (ben == 1 && pc == 0) || (ben == 2 && pc == 1) -> println("Kazandın")
        else -> println("Kaybettin")
    }
}
