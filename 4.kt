import kotlin.math.pow
fun main()
{
    println("Введите x")
    val x= readLine()!!.toDouble()
    when{
        x<=3 -> println("F(x) = " + ((x.pow( 2.0))-3*x+9))
        x>3 -> println("F(x) = " + 1/((x.pow(3.0))+6))
    }
}