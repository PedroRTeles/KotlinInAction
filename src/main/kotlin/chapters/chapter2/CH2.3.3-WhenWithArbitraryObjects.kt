package chapters.chapter2

import chapters.chapter2.Color.*
import java.lang.Exception

fun main() {
    print(mix(BLUE, YELLOW))
}

fun mix(c1: Color, c2: Color) =
    when(setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

/**
 * Kotlin's when is way more powerful than Java's switch, it allows you to use any object as branch conditions
 * not only constants (enum, string or number literals).
 * Kotlin matches all the branches in order until the condition is satisfied. If none the other branches conditions
 * is satisfied the else branch is evaluated
 */