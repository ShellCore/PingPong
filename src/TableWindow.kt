import java.awt.Graphics
import javax.swing.ImageIcon
import javax.swing.JFrame

class TableWindow(title: String, private val backgroundFile: String) : JFrame(title) {

    init {
        setSize(400, 600)
        isVisible = true
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }

    override fun paint(g: Graphics?) {
        super.paint(g)
        setupBackground(g)
    }

    private fun setupBackground(g: Graphics?) {
        val background = ImageIcon(javaClass.getResource(backgroundFile))
        g?.drawImage(background.image, 0, 0, width, height, this)
    }
}