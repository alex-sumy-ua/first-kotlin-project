//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//    val name = "Kotlin"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//}
// ********************************************************************
//fun main() {
//    println("What's your name?")
//    val name = readln()
//    println("Hello, $name!")
//}
// ********************************************************************
//fun printMessage(message: String): Unit {                               // 1
//    println(message)
//}
//
//fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
//    println("[$prefix] $message")
//}
//
//fun sum(x: Int, y: Int): Int {                                          // 3
//    return x + y
//}
//
//fun multiply(x: Int, y: Int) = x * y                                    // 4
//
//fun main() {
//    printMessage("Hello")                                               // 5
//    printMessageWithPrefix("Hello", "Log")                              // 6
//    printMessageWithPrefix("Hello")                                     // 7
//    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
//    println(sum(1, 2))                                                  // 9
//    println(multiply(2, 4))                                             // 10
//}
// ****************************************************
fun main() {

//    infix fun Int.times(str: String) = str.repeat(this)        // 1
//    println(2 times "Bye ")                                    // 2

    val pair = "Ferrari" to "Katrina"                          // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia                                       // 5


    operator fun Int.times(str: String) = str.repeat(this)       // 1
    println(2 * "Bye ")                                          // 2

    operator fun String.get(range: IntRange) = substring(range)  // 3
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..26])

    fun printAll(vararg messages: String) {                            // 1
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )

    fun log(vararg entries: String) {
        printAll(*entries)                                             // 5
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}
