class SIM(val P: Int):Mobile("Apple",28000.0,256) {

    fun QP (P: Int): Double{
        val Qp = Q1(28000.0,256)*P
        return Qp
    }
    override fun vivod2() {
        println(" функция QP = ${QP(P)}")
    }
}