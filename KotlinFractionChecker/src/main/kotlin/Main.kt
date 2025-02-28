import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // Kullanıcıdan pay (bölünen) değeri alınır
    print("Pay değerini girin: ")
    val sayi1 = input.nextInt()

    // Kullanıcıdan payda (bölen) değeri alınır
    print("Payda değerini girin: ")
    val sayi2 = input.nextInt()

    when {
        // Eğer pay ile payda eşitse, sayı tam sayıdır
        sayi1 == sayi2 -> println("Girdiğiniz değer tam sayıdır")

        // Eğer pay, paydadan küçükse, kesir basit kesirdir
        sayi1 < sayi2 -> println("Basit kesir girdiniz")

        // Eğer pay, paydadan büyükse, tam sayılı kesir veya tam sayı olabilir
        sayi1 > sayi2 -> {
            val x = sayi1 / sayi2 // Tam sayı kısmı hesaplanır
            val z = sayi2 // Payda değişmeden kalır
            val y = sayi1 % sayi2 // Kalan hesaplanır

            // Eğer kalan 0 ise, tam sayı olarak yazdırılır
            if (y == 0) {
                println(x)
            } else {
                // Tam sayılı kesir formatında çıktı verilir
                println("$x tam $y/$z")
            }
        }
    }
}
