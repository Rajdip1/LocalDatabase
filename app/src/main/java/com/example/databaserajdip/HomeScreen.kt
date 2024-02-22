package com.example.databaserajdip

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.databaserajdip.ui.theme.DatabaseRajdipTheme

class HomeScreen : AppCompatActivity() {
    lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        supportActionBar?.hide()

        resultTextView = findViewById(R.id.tvResult)

        val sharedPreference = getSharedPreferences("Login data", MODE_PRIVATE)

        val name = sharedPreference.getString("Name","")
        val password = sharedPreference.getString("Password","")

        resultTextView.text = "Name: $name \n Password: $password: "
    }
}

