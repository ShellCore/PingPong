import java.awt.Graphics
import javax.swing.ImageIcon
import javax.swing.JFrame

class TableWindow(title: String, private val backgroundFile: String) : JFrame(title) {

    private var sprites: ArrayList<Sprite> = ArrayList()

    init {
        setSize(400, 600)
        isVisible = true
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }

    override fun paint(g: Graphics?) {
        super.paint(g)
        setupBackground(g)
        sprites.forEach { sprite ->
            sprite.paint(g)
        }
    }

    fun addSprite(sprite: Sprite) {
        sprites.add(sprite)
        this.repaint()
    }

    private fun setupBackground(g: Graphics?) {
        val background = ImageIcon(javaClass.getResource(backgroundFile))
        g?.drawImage(background.image, 0, 0, width, height, this)
    }
}