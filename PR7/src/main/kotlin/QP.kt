class Qp(val P: Int,val T: Int): Tovar("pomidor",50.0,20) {

    fun QP(P: Int, T: Int): Double{
        val qp = QQ(50.0,20)+0.5*(T-P)
        return qp
    }

    override fun vivod() {
        println(" функция QP = ${QP(P, T)}")
    }
}