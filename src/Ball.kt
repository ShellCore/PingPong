import java.awt.Graphics

class Ball(figure: Figure, position: Position) : Sprite(figure, position) {

    private var moveInX = 1
    private var moveInY = 1
    private var angle = 0

    fun move(): Boolean {
        position.y += (2 - angle) * moveInY
        if (position.y > 550) {
//            listener.fail()
            moveInY *= -1
        } else if (position.y < figure.height) {
            moveInY *= -1
        }
        position.x += (2 + angle) * moveInX
        if (position.x > (400 - figure.width) || position.x < 1) {
            moveInX *= -1
        }
        return true
    }
}