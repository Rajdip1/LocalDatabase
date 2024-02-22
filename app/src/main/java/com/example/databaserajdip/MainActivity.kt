package com.example.databaserajdip

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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

class MainActivity : AppCompatActivity() {
    lateinit var editTextName: EditText
    lateinit var editTextPassword: EditText
    lateinit var buttonSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        editTextName = findViewById(R.id.etName)
        editTextPassword = findViewById(R.id.etPassword)
        buttonSave = findViewById(R.id.btnSave)

        buttonSave.setOnClickListener {
            val sharedPreference = getSharedPreferences("Login data", MODE_PRIVATE)
            val editor = sharedPreference.edit()

            val n = editTextName.text.toString()
            val p = editTextPassword.text.toString()

            editor.putString("Name",n)
            editor.putString("Password",p)

            editor.apply()

            Toast.makeText(this,"Data is saved",Toast.LENGTH_SHORT).show()

            val i = Intent(this,HomeScreen::class.java)
            startActivity(i)
        }
    }
}

