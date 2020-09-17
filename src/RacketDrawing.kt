import java.awt.Graphics
import java.awt.event.KeyEvent
import javax.swing.JComponent

class RacketDrawing(private val racket: Racket) : JComponent() {

    init {
        setLocation(racket.position.x, racket.position.y)
        setSize(racket.figure.width, racket.figure.height)
    }

    override fun paintComponent(g: Graphics?) {
        super.paintComponent(g)
        g?.apply {
            g?.apply {
                color = racket.figure.color
                fillRoundRect(racket.position.x, racket.position.y, racket.figure.width, racket.figure.height, 15, 15)
            }
        }
    }

    fun move(keyCode: Int) {
        when (keyCode) {
            KeyEvent.VK_UP -> racket.moveUp()
            KeyEvent.VK_LEFT -> racket.moveLeft()
            KeyEvent.VK_RIGHT -> racket.moveRight()
            KeyEvent.VK_DOWN -> racket.moveDown()
        }
    }
}
