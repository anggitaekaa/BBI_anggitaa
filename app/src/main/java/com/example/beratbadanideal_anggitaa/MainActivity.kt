package com.example.beratbadanideal_anggitaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var nama : EditText
    private lateinit var tb : EditText
    private lateinit var rbLaki : RadioButton
    private lateinit var jkPr : RadioButton
    private lateinit var hasil : TextView
    private lateinit var Proses : Button
    private var t_Badan :Int=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nama = findViewById(R.id.etnama)
        tb = findViewById(R.id.ettinggi)
        rbLaki = findViewById(R.id.rbLaki)
        jkPr = findViewById(R.id.rbPr)
        hasil = findViewById(R.id.tvhasil)
        Proses = findViewById(R.id.BtProses)

        //mengklik agar memproses
        Proses.setOnClickListener {
            // membuat variabel penyimpan data
            val tinggiBadan = tb.text.toString().toInt()

            if (rbLaki.isChecked){
                t_Badan = (tinggiBadan-100)-((tinggiBadan-100) * 10/100)
                hasil.setText(t_Badan.toString()+ "kg")

            } else {
                t_Badan = (tinggiBadan-100)- ((tinggiBadan-100) * 15/100)
                hasil.setText(t_Badan.toString()+ "kg")
            }
        }
    }

}