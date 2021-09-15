package chapters.chapter2

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// >>> println(max(1, 2))
// 2

/**
 * The function declaration starts with the fun keyword followed by the name (in this case: max)
 *  followed by the parameter list in the parentheses, the return type comes after the parameter list
 *  separated from it by a colon.
 *
 *  if in kotlin is an expression with a return value, similar to ternary operator in Java (a > b) ? a : b
 */

fun max2(a: Int, b: Int): Int = if (a > b) a else b

/**
 * You can simplify the function, because its a single expression you can use an expression body,
 * removing the curly braces and the return statement.
 *
 * When you have a function written with curly braces that function has a block body.
 *
 * You can use other more complex expressions using if, when or try
 */

fun max3(a: Int, b: Int) = if (a > b) a else b

/**
 * You can simplify the function even more omitting the return type
 */