package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Mradio = findViewById<RadioButton>(R.id.Mradio)
        var Kradio = findViewById<RadioButton>(R.id.Kradio)
        var radioG = findViewById<RadioGroup>(R.id.radioGroup)
        var sport = findViewById<CheckBox>(R.id.checkBoxSport)
        var muzyka = findViewById<CheckBox>(R.id.checkBoxMuzyka)
        var turystyka = findViewById<CheckBox>(R.id.checkBoxTury)
        var gry = findViewById<CheckBox>(R.id.checkBoxGry)

        var plec = ""
        radioG.setOnCheckedChangeListener { group, checkedId ->
            plec = if (Mradio.isChecked) "mezczyzna" else "kobieta"
        }
        var wiek = findViewById<EditText>(R.id.editTextNumber).text
        findViewById<Button>(R.id.button).setOnClickListener {
            var zain = "Zainteresowania:"
            if (sport.isChecked){
                zain += "sport,"
            }
            if (muzyka.isChecked){
                zain += "muzyka,"
            }
            if (turystyka.isChecked){
                zain += "turystyka,"
            }
            if (gry.isChecked){
                zain += "gry,"
            }
            Mradio.isClickable = false
            Kradio.isClickable = false
            sport.isClickable = false
            muzyka.isClickable = false
            turystyka.isClickable = false
            gry.isClickable = false
            findViewById<EditText>(R.id.editTextNumber).isClickable = false
            findViewById<TextView>(R.id.textView2).text = plec + "," + wiek +  " lat," + "\n" + zain
        }
        findViewById<Button>(R.id.button2).setOnClickListener{
            Mradio.isClickable = true
            Kradio.isClickable = true
            sport.isClickable = true
            muzyka.isClickable = true
            turystyka.isClickable = true
            gry.isClickable = true
            findViewById<EditText>(R.id.editTextNumber).isClickable = true
        }


    }
}

