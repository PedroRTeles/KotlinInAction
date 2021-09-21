package chapters.chapter2

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0,0 ), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 * g) * 256 + b
}

fun main() {
    println(Color.BLUE.rgb())
}

/**
 * enum is a soft keyword, it has a special meaning when it comes before class but it can be used
 * as a regular name in other places.
 * Enums aren't list of values, you can declare properties and methods on enum classes
 * Enums are the only place in kotlin that you required to use semicolons.
 */