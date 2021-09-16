package chapters.chapter2

class Person2(
    val name: String,
    var isMarried: Boolean
)

/**
 * In Kotlin properties are first-class language feature, which replaces the fields and accessors
 *
 * A property declared as val is ready only
 * A property declared as var is mutable and can be changed
 */

fun main(args: Array<String>) {
    val person = Person2("Bob", true)

    println(person.name)
    println(person.isMarried)
}

/**
 * You access the property direct from the object, but the getter is invoked
 * under the hood
 */