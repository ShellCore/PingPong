import java.awt.Graphics

class Ball(figure: Figure, position: Position, private val speed: Long, private val listener: MainListener) : Sprite(figure, position) {

    private var moveInX = 1
    private var moveInY = 1
    private var angle = 0

    override fun paint(g: Graphics?) {
        g?.apply {
            color = figure.color
            fillOval(position.x, position.y, figure.width, figure.height)
        }
    }

    fun move() {
        position.y += (2 - angle) * moveInY
        if (position.y > 550) {
//            listener.fail()
            moveInY *= -1
        } else if (position.y < 10) {
            moveInY *= -1
        }
        position.x += (2 + angle) * moveInX
        if (position.x > 380 || position.x < 1) {
            moveInX *= -1
        }
        Thread.sleep(speed)
    }
}