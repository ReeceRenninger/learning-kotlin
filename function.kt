fun main() {
  println("Hello, Kotlin Developer!")
}

// string templates that allows you to reference variables inside of a string for dynamic updates
fun main() {
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")
}

// passing parameters to a function, parameters are immutable by default in Kotlin
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun main() {
    println(birthdayGreeting("Sam", 5))
}
// print out: Happy Birthday, Sam! You are now 5 years old!