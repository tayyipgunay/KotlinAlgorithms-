class TV {
    var channel: Int = 120
    var volumeLevel: Int = 3
    var isOn: Boolean = false

    // TV açma fonksiyonu
    fun turnOn() {
        if (!isOn) {
            isOn = true
            println("📺 TV Açılıyor...")
        } else {
            println("⚠️ TV zaten açık!")
        }
    }

    // TV kapama fonksiyonu
    fun turnOff() {
        if (isOn) {
            isOn = false
            println("📺 TV Kapatılıyor...")
        } else {
            println("⚠️ TV zaten kapalı!")
        }
    }

    // Kanalı bir artırma
    fun channelUp() {
        if (channel < 120) {
            channel++
        } else {
            println("⚠️ 120'den yukarı kanal yok!")
        }
        println("Kanal: $channel")
    }

    // Kanalı bir azaltma
    fun channelDown() {
        if (channel > 1) {
            channel--
        } else {
            println("⚠️ 1'den aşağı kanal yok!")
        }
        println("Kanal: $channel")
    }

    // Sesi azaltma
    fun volumeDown() {
        if (volumeLevel > 1) {
            println("🔉 Ses seviyesi azaltılıyor...")
            volumeLevel--
        } else {
            println("⚠️ 1'den aşağı ses seviyesi yok!")
        }
        println("Ses Seviyesi: $volumeLevel")
    }

    // Sesi artırma
    fun volumeUp() {
        if (volumeLevel < 120) {
            println("🔊 Ses seviyesi artırılıyor...")
            volumeLevel++
        } else {
            println("⚠️ 120'den fazla ses seviyesi yok!")
        }
        println("Ses Seviyesi: $volumeLevel")
    }
}

