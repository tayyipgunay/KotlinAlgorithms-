import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val banka = Banka()

    println("💳 Hoş geldiniz! Yeni hesap oluşturuyoruz.")
    print("İsminiz: ")
    val isim = input.nextLine()

    print("Hesap Numaranızı Giriniz: ")
    val hesapNo = try {
        input.nextInt()
    } catch (e: Exception) {
        println("⚠ Geçersiz hesap numarası! Varsayılan hesap numarası atanıyor: 1001")
        1001
    }

    val hesap = Hesap(isim, hesapNo)
    banka.hesapEkle(hesap)

    while (true) {
        println("\n📌 İşlem Seçin: \n1️⃣ Para Yatır \n2️⃣ Para Çek \n3️⃣ Bakiye Sorgula \n4️⃣ Çıkış")
        print("Seçiminiz: ")
        val secim = try {
            input.nextInt()
        } catch (e: Exception) {
            println("⚠ Geçersiz giriş! Lütfen tekrar deneyin.")
            input.nextLine() // Buffer temizle
            continue
        }

        when (secim) {
            1 -> {
                print("Yatırılacak Tutar: ")
                val miktar = input.nextDouble()
                hesap.paraYatir(miktar)
            }
            2 -> {
                print("Çekilecek Tutar: ")
                val miktar = input.nextDouble()
                hesap.paraCek(miktar)
            }
            3 -> hesap.bakiyeSorgula()
            4 -> {
                println("🏦 Çıkış yapılıyor. İyi günler dileriz!")
                break
            }
            else -> println("⚠ Geçersiz seçim! Lütfen 1-4 arasında bir değer girin.")
        }
    }
}