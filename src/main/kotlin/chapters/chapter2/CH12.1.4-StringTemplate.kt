package chapters.chapter2

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello $name")
}

/**
 * String template allows you to refer to local variables in string literal by
 * adding the $ character in front of the variable name
 * This is equivalent to Java's concatenation
 *
 * The compiled codes creates a StringBuilder and appends the constant parts and variables values
 */

//println("\$x")
//>>> "$x"

/**
 * To print the $ character you must escape using the \ in the string
 */

//fun main(args: Array<String>) {
//    if (args.size > 0) {
//        println("Hello ${args[0]}")
//    }
//}

/**
 * You can use complex expressions in the template, you only need to use curly braces around it
 */

//fun main(args: Array<String>) {
//    println("Hello ${if (args > 0) args[0] else "someone"} ")
//}

/**
 * You can also nest double quotes within double quotes, as long they're within an expression
 */