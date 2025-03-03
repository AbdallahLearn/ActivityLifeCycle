package com.example.classproject

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.classproject.ui.theme.ClassProjectTheme

class MainActivity : ComponentActivity() {
    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate() called")

        enableEdgeToEdge()
        setContent {
            ClassProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Abdullah",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy() called")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ClassProjectTheme {
        Greeting("Android")
    }
}
