import kotlin.math.pow

fun commonPmt(principal: Double, annualInterestRate: Double, numberOfPayments: Int): Double {
    require(annualInterestRate > 0 && numberOfPayments > 0)
    val monthlyInterestRate = annualInterestRate / 12.0
    val denominator = (1 - (1 + monthlyInterestRate).pow(-numberOfPayments))

    return principal * (monthlyInterestRate / denominator)
}