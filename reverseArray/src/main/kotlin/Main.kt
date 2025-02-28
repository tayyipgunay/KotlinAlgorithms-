fun main(args: Array<String>) {
    val sayilar = arrayOf(2, 5, 8, 1, 9, 6) // Sıralanacak dizi
    reverseArray(sayilar)
    sayilar.forEach { println(it) }


}// 🎯 Döngü ile diziyi ters çeviren fonksiyon
fun reverseArray(arr: Array<Int>) {
    val n = arr.size
    for (i in 0 until n / 2) { // İlk yarı ile ikinci yarıyı yer değiştir
        val temp = arr[i]
        arr[i] = arr[n - 1 - i]
        arr[n - 1 - i] = temp
    }
}
