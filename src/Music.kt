import javax.sound.sampled.AudioSystem

class Music(private val musicFile: String) {

    private val clip = AudioSystem.getClip()

    fun startMusic() {
        val source = AudioSystem.getAudioInputStream(javaClass.getResourceAsStream(musicFile))
        clip.apply {
            open(source)
            start()
        }
    }

    fun resetMusic() {
        clip.framePosition = 0
    }
}