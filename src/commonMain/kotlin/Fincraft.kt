interface Fincraft {
    fun fakePmt(
        amount: Int,
        installments: Int,
    ): Int

    fun pmt(
        principal: Double,
        annualInterestRate: Double,
        numberOfPayments: Int,
    ): Double

    fun calcIof(principal: Double, days: Int): Double
}

expect object FincraftFactory {
    fun createFincraft(): Fincraft
}
