package chapters.chapter2

import chapters.chapter2.Color.*
import java.lang.Exception

fun main() {
    println(mixOptimized(BLUE, YELLOW))
}

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Exception("Dirty color")
    }

/**
 * You can use the when expression without an argument, the branches will be evaluated as any boolean expression.
 * The mixOptimized function does exactly what the mix function does, Its advantage is that it doesn't
 * create any extra objects, but the cost it's harder to read.
 */