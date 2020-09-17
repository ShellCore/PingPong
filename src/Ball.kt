import java.awt.Graphics

class Ball(figure: Figure, position: Position) : Sprite(figure, position) {
    override fun paint(g: Graphics?) {
        g?.apply {
            color = figure.color
            fillOval(position.x, position.y, figure.width, figure.height)
        }
    }
}