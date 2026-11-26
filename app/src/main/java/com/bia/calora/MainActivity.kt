package com.bia.calora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bia.calora.presentation.calculator.CalculatorScreen
import com.bia.calora.presentation.calculator.CalculatorViewModel
import com.bia.calora.ui.theme.CaloraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaloraTheme {
                val calculatorViewModel: CalculatorViewModel = viewModel()
                CalculatorScreen(viewModel = calculatorViewModel)
            }
        }
    }
}
