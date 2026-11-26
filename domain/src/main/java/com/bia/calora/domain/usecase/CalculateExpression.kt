package com.bia.calora.domain.usecase

import com.bia.calora.domain.model.CalculationResult
import com.bia.calora.domain.repository.CalculatorRepository

class CalculateExpression(private val repository: CalculatorRepository) {
    operator fun invoke(expression: String): CalculationResult = repository.calculate(expression)
}
