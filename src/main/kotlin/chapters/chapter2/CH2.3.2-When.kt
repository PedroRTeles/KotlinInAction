package chapters.chapter2

import chapters.chapter2.Color.*

fun main() {
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.ORANGE))
}

fun getMnemonic(color: Color) =
    when(color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth(color: Color) =
    when (color) {
        RED, ORANGE, YELLOW -> "warm"
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cold"
    }

/**
 * When is similar to switch in Java. It's an expression, like if, so it returns a value. You can write a
 * expression body that returns a when expression.
 * Unlike Java you don't need to write break statements in each branch. If a match is successful only the
 * corresponding branch is executed.
 *
 * You can separate multiple values with a comma
 *
 * You can import the enum package and omit the name of the class before the value
 */