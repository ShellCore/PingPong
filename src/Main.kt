import java.awt.Color

fun main() {

    val ball = Ball(Figure(20, 20, Color.WHITE), Position(50, 50))
    val racket = Racket(Figure(55, 15, Color.CYAN), Position(165, 535))

    TableWindow("Ping Pong Chingadasos", "./background.jpg").apply {
        addSprite(ball)
        addSprite(racket)
    }

    val music = Music("./music.wav")
    music.startMusic()
}