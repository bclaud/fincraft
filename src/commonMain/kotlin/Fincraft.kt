interface Fincraft {
    fun fakePmt(amount: Int, installments: Int) : Int
}

expect object FincraftFactory {
    fun createFincraft() : Fincraft
}