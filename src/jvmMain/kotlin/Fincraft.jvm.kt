actual object FincraftFactory {
    actual fun createFincraft(): Fincraft = JvmFincraft
}

object JvmFincraft : Fincraft {
    override fun fakePmt(amount: Int, installments: Int): Int {
        return amount / installments
    }
}