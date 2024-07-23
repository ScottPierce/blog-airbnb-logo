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
import dev.scottpierce.airbnb.logo.AirbnbLogo
import dev.scottpierce.airbnb.logo.svg.SvgCanvas
import dev.scottpierce.airbnb.sample.ui.theme.AirbnblogoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            AirbnblogoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        SvgCanvas(svg = AirbnbLogo.IMAGE)
                    }
                }
            }
        }
    }
}
