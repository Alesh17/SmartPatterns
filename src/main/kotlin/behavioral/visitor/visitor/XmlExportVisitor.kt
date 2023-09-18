package behavioral.visitor.visitor

import behavioral.visitor.shape.Circle
import behavioral.visitor.shape.Dot
import behavioral.visitor.shape.Rectangle
import behavioral.visitor.shape.Shape

class XmlExportVisitor : Visitor {

    fun export(vararg args: Shape): String {
        val sb = StringBuilder()
        for (shape in args) sb.append(shape.accept(this)).append("\n")
        return sb.toString()
    }

    override fun visit(dot: Dot): String {
        return "<dot>" + "\n" +
                "    <id>" + dot.id + "</id>" + "\n" +
                "    <x>" + dot.x + "</x>" + "\n" +
                "    <y>" + dot.y + "</y>" + "\n" +
                "</dot>"
    }

    override fun visit(circle: Circle): String {
        return "<circle>" + "\n" +
                "    <id>" + circle.id + "</id>" + "\n" +
                "    <x>" + circle.x + "</x>" + "\n" +
                "    <y>" + circle.y + "</y>" + "\n" +
                "    <radius>" + circle.radius + "</radius>" + "\n" +
                "</circle>"
    }

    override fun visit(rect: Rectangle): String {
        return "<rectangle>" + "\n" +
                "    <id>" + rect.id + "</id>" + "\n" +
                "    <x>" + rect.x + "</x>" + "\n" +
                "    <y>" + rect.y + "</y>" + "\n" +
                "    <width>" + rect.width + "</width>" + "\n" +
                "    <height>" + rect.height + "</height>" + "\n" +
                "</rectangle>"
    }
}