package chapters.chapter2

val question = "The Ultimate Question of Life, the Universe, and Everything"
val answer = 42

/**
 * The examples above omit the type declarations
 */

val question2: String = "The Ultimate Question of Life, the Universe, and Everything"
val answer2: Int = 42

/**
 * If you don't specify the type, the compiler analyzes the initializer expression
 * and uses its type as the variable type.
 */

val yearsToCompute = 7.5e6 //<---- 7.5 * 10^6 = 7500000.0

/**
 * If the number has a floating point we declare it as a Double
 */

val country = "Brazil"
var year = 2021

/**
 * val (value) is immutable, once its initialized it can't be reassigned. It corresponds to final variable in Java
 * var (variable) is mutable, its value can be changed. It corresponds to regular non-final variables in Java
 *
 * By default you should always declare all variables with the val keyword
 */

//var answer3 = 42
//answer3 = "no answer"

/**
 * var keyword allows a variable to change its value but its type is fixed. The above commented code won't compile
 */