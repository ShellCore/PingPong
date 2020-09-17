import java.awt.Graphics

abstract class Sprite(
    var figure: Figure,
    var position: Position
) {

    abstract fun paint(g: Graphics?)
}