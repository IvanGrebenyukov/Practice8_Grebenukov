import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

fun main()
{
    println("Введите с каким классом хотите работать(drive/cinema)")
    var vibor: String = readLine()!!.toString()
    while(vibor != "drive" && vibor != "cinema")
    {
        println("Введите с каким классом хотите работать(drive/cinema)")
        var vibor = readLine()!!.toString()
    }
    when{
        (vibor == "drive") -> {
            val object1: Drive = Drive(5)
            object1.Input()
            object1.Output()
            object1.NumberOfDaysOnTheRoad()
            val object2: Drive = Drive(10, "Екатеринбург")
            println("\n\nНомер поезда: ${object2.number} Пункт назначения: ${object2.destination}")
            val object3: Drive = Drive(10, "Екатеринбург", "2023.02.10-2023.03.10")
            println("\n\nНомер поезда: ${object2.number} Пункт назначения: ${object2.destination} Дней в пути ${object3.days_of_travel}")
            object3.NumberOfDaysOnTheRoad()
        }
        (vibor == "cinema") -> {
            val object1: Cinema = Cinema("Чебурашка")
            object1.Input()
            object1.Output()
            object1.RublesPerHour()
            object1.Incom()
            val object2: Cinema = Cinema("Мстители", 300.0)
            println("\n\nНазвание фильма: ${object2.name} Стоимость билета: ${object2.price}")
            val object3: Cinema = Cinema("Мстители", 450.0, 5)
            println("\n\nНазвание фильма: ${object2.name}  Cтоимость билета: ${object3.price}  Номер зала${object3.hall}")
            object1.RublesPerHour()
        }
    }
}




