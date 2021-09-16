package chapters.chapter2

import chapters.chapter2.geometry.shapes.createRandomRectangle

fun main(args: Array<String>) {
    print(createRandomRectangle().isSquared)
}

/**
 * Similar to Java, Kotlin organizes the files into packages,
 * classes, functions and properties will be stored in the packaged declared at the top of file
 * Declarations can be used directly if they're in the same package,
 * they need to be imported if they're not in the same package.
 * As in java we import those declarations using the import keyword at the beginning of the file
 *
 * You can import a top level function by its name
 * You can import all declarations in a file using .* after the package name, this will make all classes,
 * top level functions and properties visible.
 */