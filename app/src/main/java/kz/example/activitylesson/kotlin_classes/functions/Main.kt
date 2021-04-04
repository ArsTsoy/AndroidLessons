package kz.example.activitylesson.kotlin_classes.functions

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 3/31/21
 */

fun main() {
    val greetingFunc: (String, String) -> String = { playerName, str2 ->
        "$playerName$str2"
    }
    print(greetingFunc.invoke("2", "23"))
    g{

    }

}

inline fun g(function: String.() -> Unit): String  {
    function.invoke("hehe")
    return ""
}

inline fun g2(s: String): String  {

    return ""
}

//fun String.myCount(howToCheck: (s: Char) -> Boolean): Int {
//    for(i in )
//}