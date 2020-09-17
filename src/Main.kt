import java.awt.BorderLayout
import java.awt.Color
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
import javax.swing.JFrame

fun main() {

    Music("./music.wav").startMusic()

    val ball = Ball(Figure(20, 20, Color.WHITE), Position(50, 50))
    val racket = Racket(Figure(55, 15, Color.CYAN), Position(165, 535))

    val ballDrawing = BallDrawing(ball)
    val racketDrawing = RacketDrawing(racket)

    val panel = CustomJPanel("./background.jpg").apply {
        layout = BorderLayout()
        addDrawing(ballDrawing)
        addDrawing(racketDrawing)
    }

    JFrame("PingPong").apply {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        add(panel)
        setSize(400, 600)
        isResizable = false
        setLocationRelativeTo(null)
        isVisible = true

        addKeyListener(object : KeyListener {
            override fun keyTyped(e: KeyEvent?) {}
            override fun keyReleased(e: KeyEvent?) {}
            override fun keyPressed(e: KeyEvent?) {
                e?.let { racketDrawing.move(e.keyCode) }
                repaint()
            }
        })

        while (ballDrawing.move()) {
            repaint()
            Thread.sleep(20)
        }
    }
}