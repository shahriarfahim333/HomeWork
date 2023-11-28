import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter a year: ")
    val year: Int = reader.nextInt()

    if (isLeapYear(year)) {
        println("$year is a Leap Year")
    } else {
        println("$year is not a Leap Year")
    }
}

fun isLeapYear(year: Int): Boolean {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}