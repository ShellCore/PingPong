import java.awt.Graphics

abstract class Sprite(
    var figure: Figure,
    var position: Position
) {

    val initialPosition = position.copy()

    fun resetSprite() {
        position.apply {
            x = initialPosition.x
            y = initialPosition.y
        }
    }

    abstract fun paint(g: Graphics?)
}