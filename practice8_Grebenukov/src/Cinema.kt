import java.time.LocalDate
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString

class Cinema(_name: String)
{
    constructor(_name: String, _price: Double) : this(_name)
    {
        price = _price
    }
    constructor(_name: String, _price: Double, _hall: Int) : this(_name, _price)
    {
       hall = _hall
    }
    var name = _name
    var session: String = "23.25"
    var price: Double = 299.99
    var hall: Int = 5
    var number_of_spectators: Int = 100
    fun Incom()
    {
        val incom = number_of_spectators * price
        println("Доход с сеанса равен $incom")
    }
    fun RublesPerHour()
    {
        val rubles_per_hour = price /  session.toDouble()
        println("Рублей за час сеанса ${String.format("%.2f", rubles_per_hour)}")
    }
    fun Input()
    {
        println("Введите название фильма")
        name = readLine()!!.toString()
        println("Введите время сеанса в формате НН.mm")
        session = readLine()!!.toString()
        while(true) {
            try {
                while (true) {
                    var list2 = session.split('.')
                    var hours: Int = list2[0].toInt()
                    var minutes: Int = list2[1].toInt()
                    if (hours in 1..23) {
                        if (minutes in 1..59)
                            break
                    } else {
                        println("Введите время в правильном формате")
                        session = readLine()!!.toString()
                    }
                }
                break
            }
            catch (e: Exception)
            {
                println("Введите время в правильном формате")
                session = readLine()!!.toString()
            }
        }
        while(true) {
            try {
                println("Введите стоимость билета")
                price = readLine()!!.toDouble()
                while (price < 0) {
                    println("Стоимость больше 0")
                    price = readLine()!!.toDouble()
                }
                break
            }
            catch (e: Exception){
                println("Введите число")
                price = readLine()!!.toDouble()
            }
        }
        while(true) {
            try {
                println("Введите номер зала")
                hall = readLine()!!.toInt()
                while (hall < 0) {
                    println("Номер зала больше 0")
                    hall = readLine()!!.toInt()
                }
                break
            }
            catch (e: Exception){
                println("Введите число")
                hall = readLine()!!.toInt()
            }
        }

        while(true){
            try {
                println("Введите количество зрителей")
                number_of_spectators = readLine()!!.toInt()
                while (number_of_spectators !in  0 ..3000) {
                    println("Количество зрителей в диапозоне от 0 до 3000")
                    number_of_spectators = readLine()!!.toInt()
                }
                break
            }
            catch (e: Exception){
                println("Введите число")
                number_of_spectators = readLine()!!.toInt()
            }
        }

    }
    fun Output()
    {
        print("Название фильма: ")
        println(name)
        print("Время сеанса: ")
        println(session)
        print("Стоимость билета: ")
        println(price)
        print("Номер зала: ")
        println(hall)
        println("Количество зрителей")
        println(number_of_spectators)
    }
}