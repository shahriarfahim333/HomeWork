import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter your marks: ")
    val mark: Int = reader.nextInt()

    val grade = calculateGrade(mark)
    println("you have '$grade' grade")
}

fun calculateGrade(mark: Int): String {
    return when {
        mark >= 80 -> "A+"
        mark >= 70 -> "A"
        mark >= 60 -> "A-"
        mark >= 50 -> "B"
        mark >= 40 -> "C"
        mark >= 33 -> "D"
        else -> "you FAIL"
    }
}
