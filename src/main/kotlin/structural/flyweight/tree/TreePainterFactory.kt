package structural.flyweight.tree

import java.awt.Color

/** Здесь хранятся и выдаются все тяжелые объекты. */
object TreePainterFactory {

    private val painters: MutableMap<String, TreePainter> = HashMap()

    fun getTreePainter(name: String, color: Color): TreePainter {
        var result = painters[name]
        if (result == null) {
            result = TreePainter(color)
            painters[name] = result
        }
        return result
    }
}