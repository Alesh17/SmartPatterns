package structural.composit.shape

import java.awt.Graphics

interface Shape {

    val x: Int
    val y: Int
    val width: Int
    val height: Int

    fun move(x: Int, y: Int)
    fun isInsideBounds(x: Int, y: Int): Boolean
    fun paint(graphics: Graphics)
}