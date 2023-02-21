open class Tovar(val name: String, val cena: Double, val kol: Int) {

    fun QQ(cena: Double, kol: Int): Double {
        val Q = cena / kol
        return Q
    }

    open fun vivod() {
        println(" наименование товара - $name \n цена - $cena \n кол-во $kol \n функция Q = ${QQ(cena, kol)}")
    }
}