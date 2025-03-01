class Banka {
    private val hesaplar = mutableListOf<Hesap>()

    fun hesapEkle(hesap: Hesap) {
        hesaplar.add(hesap)
        println("✅ Hesap başarıyla oluşturuldu: ${hesap.isim} (No: ${hesap.hesapNo})")
    }
}

class Hesap(val isim: String, val hesapNo: Int) {
    private var bakiye: Double = 100.0

    fun paraYatir(miktar: Double) {
        if (miktar <= 0) {
            println("⚠ Lütfen pozitif bir tutar giriniz.")
            return
        }
        bakiye += miktar
        println("💰 $miktar TL yatırıldı. Yeni Bakiye: $bakiye TL")
    }

    fun paraCek(miktar: Double) {
        when {
            miktar <= 0 -> println("⚠ Çekilecek tutar 0'dan büyük olmalıdır!")
            miktar > bakiye -> println(" Yetersiz bakiye! Mevcut bakiye: $bakiye TL")
            else -> {
                bakiye -= miktar
                println("✅ $miktar TL çekildi. Yeni Bakiye: $bakiye TL")
            }
        }
    }

    fun bakiyeSorgula() {
        println("🏦 Hesap Sahibi: $isim")
        println("💳 Hesap No: $hesapNo")
        println("💰 Güncel Bakiye: $bakiye TL")
    }
}