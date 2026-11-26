package com.bia.calora.presentation.calculator

import androidx.lifecycle.ViewModel
import com.bia.calora.data.calculator.DefaultCalculatorRepository
import com.bia.calora.domain.usecase.CalculateExpression
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class CalculatorUiState(
    val expression: String = "",
    val result: String = "0",
)

class CalculatorViewModel(
    private val calculateExpression: CalculateExpression =
        CalculateExpression(DefaultCalculatorRepository()),
) : ViewModel() {
    private val _uiState = MutableStateFlow(CalculatorUiState())
    val uiState: StateFlow<CalculatorUiState> = _uiState.asStateFlow()

    fun onExpressionChanged(expression: String) {
        _uiState.value = _uiState.value.copy(
            expression = expression,
            result = if (expression.isBlank()) "0" else calculateExpression(expression).displayValue,
        )
    }
}
