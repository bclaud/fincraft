actual object FincraftFactory {
    actual fun createFincraft(): Fincraft = JvmFincraft
}

object JvmFincraft : Fincraft {
    override fun fakePmt(
        amount: Int,
        installments: Int,
    ): Int {
        return amount / installments
    }

    override fun calcIof(principal: Double, days: Int): Double = commonCalcIof(principal, days)

    override fun pmt(
        principal: Double,
        annualInterestRate: Double,
        numberOfPayments: Int,
    ): Double {
        return commonPmt(principal, annualInterestRate, numberOfPayments)
    }
}
