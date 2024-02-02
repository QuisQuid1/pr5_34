fun main(){
    println("Введите возраст")
    var a =readLine()!!.toInt()
    when{
        (a>0 && a<=2) -> println("Младенец")
        (a>=2 && a<=12) -> println("Ребенок")
        (a>=13 && a<=17) -> println("Подросток")
        (a>=18 && a<=59) -> println("взрослый")
        (a>=60) -> println("пожилой")
    }
}