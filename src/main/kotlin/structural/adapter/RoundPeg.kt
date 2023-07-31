package structural.adapter

import kotlin.properties.Delegates

/**
 * КруглыеКолышки совместимы с КруглымиОтверстиями.
 */
open class RoundPeg {
    open var radius: Double by Delegates.notNull()
}