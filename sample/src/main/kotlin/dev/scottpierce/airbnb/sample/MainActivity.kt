package dev.scottpierce.airbnb.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.scottpierce.airbnb.logo.AirbnbLogo
import dev.scottpierce.airbnb.sample.ui.theme.AirbnbLogoSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            AirbnbLogoSampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        AirbnbLogo(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 24.dp),
                        )
                    }
                }
            }
        }
    }
}
