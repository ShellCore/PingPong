import java.awt.Graphics

class Racket(figure: Figure, position: Position) : Sprite(figure, position) {

    companion object {
        const val TOP_LIMIT = 10
        const val BOTTOM_LIMIT = 560
        const val RIGHT_LIMIT = 395
        const val LEFT_LIMIT = 5
    }

    fun moveUp() {
        if (position.y > TOP_LIMIT + figure.height) {
            position.y -= 15
        }
    }

    fun moveDown() {
        if (position.y < BOTTOM_LIMIT - figure.height) {
            position.y += 15
        }
    }

    fun moveLeft() {
        if (position.x > LEFT_LIMIT) {
            position.x -= 15
        }
    }

    fun moveRight() {
        if (position.x < RIGHT_LIMIT - figure.width) {
            position.x += 15
        }
    }
}