package com.example.tp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var chkAndro: CheckBox
    lateinit var chkMicro: CheckBox

    lateinit var btnAffich: Button

    lateinit var radSpecialityType: RadioGroup
    lateinit var radDSI: RadioButton
    lateinit var radRSI: RadioButton
    lateinit var radSEM: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chkAndro = findViewById(R.id.chAndroid)
        chkMicro = findViewById(R.id.chMicrosoft)
        btnAffich = findViewById(R.id.Button)
        radSpecialityType = findViewById(R.id.radioGroupSpecialiteType)
        radDSI = findViewById(R.id.radDsi)
        radRSI = findViewById(R.id.radRsi)
        radSEM = findViewById(R.id.radSem)

        btnAffich.setOnClickListener {
            var msg: String = "Specialte: "
            var option: String = ", Club: "

            if (chkAndro.isChecked) option += "Android"
            if (chkMicro.isChecked) option += "Microsoft"


            if (radSpecialityType.checkedRadioButtonId == R.id.radSem) {
                msg += "SEM" + option
            }
            if (radSpecialityType.checkedRadioButtonId == R.id.radRsi) {
                msg += "RSI" + option
            }
            if (radDSI.isChecked) {
                msg += "DSI" + option
            }

            Toast.makeText(getApplicationContext(), msg,
            Toast.LENGTH_LONG).show()


        }
    }
}