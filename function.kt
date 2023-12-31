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

//! practice problem with string templates
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId. 
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String{
	return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."

}

//! phone time problem
fun phoneTime(timeSpentToday : Int, timeSpentYesterday : Int) : Boolean{
  // > returns true otherwise false, no other code needed
  return timeSpentToday > timeSpentYesterday 
}

fun main(){
    val timeSpentToday1 = 300
    val timeSpentYesterday1 = 250

    println("Did you spend more time on the phone today compared to yesterday? " +
            "${phoneTime(timeSpentToday1, timeSpentYesterday1)}") 

    val timeSpentToday2 = 300
    val timeSpentYesterday2 = 300

    println("Did you spend more time on the phone today compared to yesterday? " +
            "${phoneTime(timeSpentToday2, timeSpentYesterday2)}") 

    val timeSpentToday3 = 200
    val timeSpentYesterday3 = 220

    println("Did you spend more time on the phone today compared to yesterday? " +
            "${phoneTime(timeSpentToday3, timeSpentYesterday3)}") 
}

//! printing weather problem
// ** cant return multiple items so created a data class(googled) that can be returned from the individual city functions
data class WeatherInfo(val city: String, val lowTemp: String, val highTemp: String, val rain: String)

// we put WeatherInfo as the item to be returned in the function signature and then return it as a variable
fun ankara(city: String, lowTemp: String, highTemp: String, rain: String): WeatherInfo {
    val weatherInfo = WeatherInfo(city, lowTemp, highTemp, rain)
    println("City: ${weatherInfo.city}")
    println("Low temperature: ${weatherInfo.lowTemp}, High temperature: ${weatherInfo.highTemp}")
    println("Chance of rain: ${weatherInfo.rain}")
    return weatherInfo
}

fun tokyo(city: String, lowTemp: String, highTemp: String, rain: String): WeatherInfo {
    val weatherInfo = WeatherInfo(city, lowTemp, highTemp, rain)
    println("City: ${weatherInfo.city}")
    println("Low temperature: ${weatherInfo.lowTemp}, High temperature: ${weatherInfo.highTemp}")
    println("Chance of rain: ${weatherInfo.rain}")
    return weatherInfo
}

fun capeTown(city: String, lowTemp: String, highTemp: String, rain: String): WeatherInfo {
    val weatherInfo = WeatherInfo(city, lowTemp, highTemp, rain)
    println("City: ${weatherInfo.city}")
    println("Low temperature: ${weatherInfo.lowTemp}, High temperature: ${weatherInfo.highTemp}")
    println("Chance of rain: ${weatherInfo.rain}")
    return weatherInfo
}

fun guatemalaCity(city: String, lowTemp: String, highTemp: String, rain: String): WeatherInfo {
    val weatherInfo = WeatherInfo(city, lowTemp, highTemp, rain)
    println("City: ${weatherInfo.city}")
    println("Low temperature: ${weatherInfo.lowTemp}, High temperature: ${weatherInfo.highTemp}")
    println("Chance of rain: ${weatherInfo.rain}")
    return weatherInfo
}


fun main() {
    ankara("Ankara", "27", "31", "82%")
	  tokyo("Tokyo", "32", "36", "10%")
    capeTown("Cape Town", "59", "64", "2%")
    guatemalaCity("Guatemala City", "50", "55", "7%")

}