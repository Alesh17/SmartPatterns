package structural.flyweight.forest

import structural.flyweight.tree.Tree
import structural.flyweight.tree.TreePainterFactory
import java.awt.Color
import java.awt.Graphics
import javax.swing.JFrame

class Forest : JFrame() {

    private val trees = ArrayList<Tree>()

    fun plant(x: Int, y: Int, name: String, color: Color) {
        val painter = TreePainterFactory.getTreePainter(name, color)
        val tree = Tree(x, y, painter)
        trees.add(tree)
    }

    override fun paint(graphics: Graphics) {
        for (tree in trees) tree.draw(graphics)
    }
}