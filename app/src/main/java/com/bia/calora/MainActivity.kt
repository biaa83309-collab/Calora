package com.bia.calora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bia.calora.presentation.calculator.CalculatorScreen
import com.bia.calora.presentation.calculator.CalculatorViewModel
import com.bia.calora.presentation.splash.CaloraLaunchFlow
import com.bia.calora.designsystem.theme.CaloraTheme
import com.bia.calora.designsystem.theme.CaloraThemeMode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaloraTheme(mode = CaloraThemeMode.Dark) {
                val calculatorViewModel: CalculatorViewModel = viewModel()
                CaloraLaunchFlow {
                    CalculatorScreen(viewModel = calculatorViewModel)
                }
            }
        }
    }
}
