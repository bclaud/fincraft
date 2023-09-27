actual object FincraftFactory {
    actual fun createFincraft(): Fincraft = JsFincraft
}

object JsFincraft : Fincraft {
    override fun fakePmt(
        amount: Int,
        installments: Int,
    ): Int = amount / installments

    override fun calcIof(principal: Double, days: Int): Double = commonCalcIof(principal, days)

    override fun pmt(
        principal: Double,
        annualInterestRate: Double,
        numberOfPayments: Int,
    ): Double {
        return commonPmt(principal, annualInterestRate, numberOfPayments)
    }
}
