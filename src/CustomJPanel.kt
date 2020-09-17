import java.awt.Graphics
import javax.swing.ImageIcon
import javax.swing.JComponent
import javax.swing.JPanel

class CustomJPanel(private val backgroundFile: String) : JPanel() {

    var components = arrayListOf<JComponent>()

    override fun paint(g: Graphics?) {
        super.paint(g)
        setupBackground(g)
        components.forEach {
            it.paint(g)
        }
    }

    fun addDrawing(component: JComponent) {
        components.add(component)
    }

    private fun setupBackground(g: Graphics?) {
        val background = ImageIcon(javaClass.getResource(backgroundFile))
        g?.drawImage(background.image, 0, 0, width, height, this)
    }
}
