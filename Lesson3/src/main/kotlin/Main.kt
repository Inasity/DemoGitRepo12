import java.util.*

fun dayOfWeek()
{
    println("What day is it today?")
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> "Time broke"
    }
}

fun kotlinHour()
{
    if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) println("Good morning, Kotlin") else println("Good night, Kotlin")
}

fun feedTheFish()
{

}

fun main(args: Array<String>)
{
    println("Hello, ${args[0]}!")
    dayOfWeek()
    kotlinHour()
}