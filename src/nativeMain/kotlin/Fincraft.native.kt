actual object FincraftFactory {
    actual fun createFincraft(): Fincraft = NativeFincraft
}

object NativeFincraft : Fincraft {
    override fun fakePmt(amount: Int, installments: Int): Int {
        println("native test!!")
        return amount / installments
    }

}