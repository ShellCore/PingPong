import java.awt.Graphics

class Racket(figure: Figure, position: Position) : Sprite(figure, position) {
    override fun paint(g: Graphics?) {
        g?.apply {
            color = figure.color
            fillRoundRect(position.x, position.y, figure.width, figure.height, 15, 15)
        }
    }
}