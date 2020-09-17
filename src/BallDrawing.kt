import java.awt.Graphics
import javax.swing.JComponent

class BallDrawing(private val ball: Ball) : JComponent() {

    init {
        setLocation(ball.position.x, ball.position.y)
        setSize(ball.figure.width, ball.figure.height)
    }

    override fun paintComponent(g: Graphics?) {
        super.paintComponent(g)
        g?.apply {
            this.color = ball.figure.color
            fillOval(ball.position.x, ball.position.y, ball.figure.width, ball.figure.height)
        }
    }

    fun move(): Boolean {
        return ball.move()
    }
}
