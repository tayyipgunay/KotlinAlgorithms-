// Proje Adı: NumberFilter
// Verilen bir listenin elemanlarını tersine çeviren ve yeni bir liste olarak döndüren fonksiyon

fun listeyiTersCevir(liste: List<Int>): List<Int> {
    val tersListe = mutableListOf<Int>() // Yeni boş bir liste oluşturuyoruz

    // Listenin son elemanından başlayarak başa doğru ilerliyoruz
    for (i in liste.size - 1 downTo 0) {
        tersListe.add(liste[i]) // Elemanı ters listeye ekliyoruz
    }

    return tersListe // Ters çevrilmiş listeyi döndürüyoruz
}

// Fonksiyonun çalışmasını test etmek için örnek kullanım
fun main() {
    val ornekListe = listOf(1, 2, 3, 4, 5)
    val tersListe = listeyiTersCevir(ornekListe)

    println("Orijinal Liste: $ornekListe")
    println("Ters Çevrilmiş Liste: $tersListe")
    // Çıktı:
    // Orijinal Liste: [1, 2, 3, 4, 5]
    // Ters Çevrilmiş Liste: [5, 4, 3, 2, 1]
}
