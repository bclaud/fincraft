import kotlin.math.pow

fun commonPmt(
    principal: Double,
    annualInterestRate: Double,
    numberOfPayments: Int,
): Double {
    // TODO wrong calculation
    require(annualInterestRate > 0 && numberOfPayments > 0)
    val monthlyInterestRate = annualInterestRate / 12.0
    val denominator = (1 - (1 + monthlyInterestRate).pow(-numberOfPayments))

    return principal * (monthlyInterestRate / denominator)
}

fun commonPmt2(rate: Double, nper: Int, pv: Double, fv: Double = 0.0, type: Int = 0): Double {
    require(rate > 0 && nper > 0)

    val denominator = (1 - (1 + rate).pow(-nper)) / rate

    val payment = (fv + pv * (1 + rate * type)) / denominator
    return -payment
}

fun commonCalcIof(principal: Double, days: Int): Double {
    // TODO is there a limit? I have to take care of CNPJ too
    val iofQuota = when {
        days >= 366 -> 3.00 / 100
        else -> days * 0.0082 / 100
    }
    val iof = principal * iofQuota
    val additionalIof = principal * (0.0082 / 100) * days

    return iof + additionalIof
}

fun main() {
    val rate = 0.05
    val nper = 12
    val pv = -10000.0


    val payment = commonPmt2(rate / 12, nper, pv)
    println("Monthly Payment : $payment")


    val iof = commonCalcIof(50000.00, 365)
    println("Iof: $iof")
}