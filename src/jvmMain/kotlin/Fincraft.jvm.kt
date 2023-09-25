import kotlin.math.pow

actual object FincraftFactory {
    actual fun createFincraft(): Fincraft = JvmFincraft
}

object JvmFincraft : Fincraft {
    override fun fakePmt(amount: Int, installments: Int): Int {
        return amount / installments
    }

    override fun pmt(principal: Double, annualInterestRate: Double, numberOfPayments: Int): Double {
        require(annualInterestRate > 0 && numberOfPayments > 0)
        val monthlyInterestRate = annualInterestRate / 12.0
        val denominator = (1 - (1 + monthlyInterestRate).pow(-numberOfPayments))

        return principal * (monthlyInterestRate / denominator)
    }
}