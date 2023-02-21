open class Mobile(val marka: String, val cena: Double, val pamyat: Int) {

    fun Q1 (cena: Double, pamyat:Int): Double{
        val Q = pamyat/cena
        return Q
    }
    open fun vivod2(){
        println(" марка телефона - $marka \n цена - $cena \n кол-во памяти $pamyat ГБ \n функция Q = ${Q1(cena,pamyat)}")
    }
}