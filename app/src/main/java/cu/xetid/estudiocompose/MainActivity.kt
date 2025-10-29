package cu.xetid.estudiocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import cu.xetid.estudiocompose.ui.theme.EstudioComposeTheme
import androidx.compose.ui.Modifier
import cu.xetid.estudiocompose.ui.login.ui.LoginScreens
import cu.xetid.estudiocompose.ui.login.ui.LoginViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            EstudioComposeTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize()

                ) {
                    LoginScreens(LoginViewModel())
                }

            }
        }
    }




}

