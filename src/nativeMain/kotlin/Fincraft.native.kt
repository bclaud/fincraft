import kotlin.math.pow

actual object FincraftFactory {
    actual fun createFincraft(): Fincraft = NativeFincraft
}

object NativeFincraft : Fincraft {
    override fun fakePmt(amount: Int, installments: Int): Int {
        return amount / installments
    }

    override fun pmt(principal: Double, annualInterestRate: Double, numberOfPayments: Int): Double {
        return commonPmt(principal, annualInterestRate, numberOfPayments)
    }

}