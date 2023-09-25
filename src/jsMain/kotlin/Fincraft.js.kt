actual object FincraftFactory {
    actual fun createFincraft(): Fincraft = JsFincraft
}

object JsFincraft : Fincraft {
    override fun fakePmt(amount: Int, installments: Int): Int = amount / installments
}