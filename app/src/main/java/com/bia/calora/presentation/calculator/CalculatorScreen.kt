package com.bia.calora.presentation.calculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.bia.calora.R
import com.bia.calora.designsystem.theme.CaloraSpacing

@Composable
fun CalculatorScreen(viewModel: CalculatorViewModel) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding).padding(CaloraSpacing.screenHorizontal),
            verticalArrangement = Arrangement.spacedBy(CaloraSpacing.lg),
        ) {
            Text(text = stringResource(R.string.app_name))
            TextField(
                value = state.expression,
                onValueChange = viewModel::onExpressionChanged,
                label = { Text(stringResource(R.string.calculator_expression_label)) },
                singleLine = true,
            )
            Text(text = state.result)
        }
    }
}
