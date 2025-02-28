import java.util.Scanner

fun main() {
    // 📌 Soru: Girilen kelimenin palindrom olup olmadığını kontrol etme
    // Kullanıcıdan bir kelime alınarak, bu kelimenin tersinin aynı olup olmadığı kontrol edilir.

    val input = Scanner(System.`in`)
    print("Bir kelime girin: ")
    val kelime = input.nextLine()

    if (isPalindrome(kelime)) {
        println("\"$kelime\" bir palindromdur.")
    } else {
        println("\"$kelime\" bir palindrom değildir.")
    }
}

// 🎯 Palindrom kontrolünü yapan fonksiyon
fun isPalindrome(kelime: String): Boolean {
    var tersKelime = ""
    for (i in kelime.length - 1 downTo 0) { // Döngü ile kelimenin tersini oluştur
        tersKelime += kelime[i]
    }
    return kelime.equals(tersKelime)
}
