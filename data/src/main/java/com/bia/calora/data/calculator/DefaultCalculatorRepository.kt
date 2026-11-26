package com.bia.calora.data.calculator

import com.bia.calora.domain.model.CalculationResult
import com.bia.calora.domain.repository.CalculatorRepository

/** Temporary implementation boundary; replace the evaluator as calculator behavior is built. */
class DefaultCalculatorRepository : CalculatorRepository {
    override fun calculate(expression: String): CalculationResult {
        val normalized = expression.trim()
        val value = normalized.toDoubleOrNull() ?: 0.0
        return CalculationResult(value, value.toString())
    }
}
