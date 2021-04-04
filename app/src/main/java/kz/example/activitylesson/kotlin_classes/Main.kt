package kz.example.activitylesson.kotlin_classes

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 3/30/21
 */
fun main() {
    val t = 100 downTo 20
    val t2 = with(t) {
        this.first
    }

    t.apply {

    }
    t.run{

    }
    t.takeIf { true }
    t.takeUnless { true }
    t.also {  }
    t.let {
        "fasf"
    }

}

const val myConstVal = 10

fun method1(t: EnumClass): String? {
    return when (t) {
        EnumClass.Type1 -> {
            null
        }
        EnumClass.Type2 -> {
            null
        }
    }
    return null
}

fun method2(t: EnumClass) {
    when (t) {
        EnumClass.Type1 -> {
            null
        }
//        EnumClass.Type2 -> { null }
    }

}

fun method3(t: Sealed): String? {
    return when (t) {
        is Sealed.Type1 -> {
            null
        }
        is Sealed.Type2 -> {
            null
        }
        is Sealed.Type3 -> {
            null
        }
    }

    return null
}

fun method4(t: Sealed) {
    when (t) {
        is Sealed.Type1 -> {
            null
        }
        is Sealed.Type2 -> {
            null
        }

    }


}



