package kz.example.activitylesson.kotlin_classes

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 3/30/21
 */

sealed class Sealed {
    class Type1(val n: String): Sealed()
    class Type2(val a: Int, b: String): Sealed()
    object Type3: Sealed()
}