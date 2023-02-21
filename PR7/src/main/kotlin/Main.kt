fun main() {
    val tovar: Tovar = Tovar("pomidor", 50.0, 20)
    val QP: Qp = Qp(2007, 2023)
    tovar.vivod()
    QP.vivod()

    // класс Tovar и класс Qp относится к первой задаче (номер 3)
    // все что ниже, следующая задача (номер 6)

    println()
    val mobile: Mobile = Mobile("Apple", 28000.0, 256)
    val sim: SIM = SIM(5000)
    mobile.vivod2()
    sim.vivod2()
}