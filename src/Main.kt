import java.awt.Color
import java.awt.event.KeyEvent
import java.awt.event.KeyListener

fun main() {

    val ball = Ball(Figure(20, 20, Color.WHITE), Position(50, 50))
    val racket = Racket(Figure(55, 15, Color.CYAN), Position(165, 535))

    TableWindow("Ping Pong Chingadasos", "./background.jpg").apply {
        addSprite(ball)
        addSprite(racket)
        addKeyListener(object : KeyListener {
            override fun keyTyped(e: KeyEvent?) {}

            override fun keyPressed(e: KeyEvent?) {
                when (e?.keyCode) {
                    KeyEvent.VK_UP -> racket.moveUp()
                    KeyEvent.VK_LEFT -> racket.moveLeft()
                    KeyEvent.VK_RIGHT -> racket.moveRight()
                    KeyEvent.VK_DOWN -> racket.moveDown()
                }
                repaint()
            }

            override fun keyReleased(e: KeyEvent?) {}

        })
    }

    Music("./music.wav").startMusic()
}