package chapters.chapter2

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

/**
 * The property is square doesn't need a field to store its values
 * instead it uses a custom accessor and implements a logic
 * The value is computed every time the property is accessed
 *
 * Similar to functions you can omit the curly braces
 * get() = height == width
 */

fun main (args: Array<String>) {
    val rectangle = Rectangle(13, 5)

    println(rectangle.isSquare)
}

