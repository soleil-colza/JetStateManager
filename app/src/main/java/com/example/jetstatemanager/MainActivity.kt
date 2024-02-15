package com.example.jetstatemanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetstatemanager.presentation.WellnessScreen
import com.example.jetstatemanager.ui.theme.JetStateManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetStateManagerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WellnessScreen()
                }
            }
        }
    }
}

@Composable
fun StateManager(modifier: Modifier = Modifier) {
    val count = 0
    Text(
        text = "You've had $count glasses",
        modifier = modifier
            .padding(16.dp)
    )

}

@Composable
@Preview(showBackground = true)
fun StateManagerPreview() {
    JetStateManagerTheme {
        StateManager()
    }
}