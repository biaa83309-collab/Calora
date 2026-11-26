package com.bia.calora.domain.repository

import com.bia.calora.domain.model.CalculationResult

interface CalculatorRepository {
    fun calculate(expression: String): CalculationResult
}
