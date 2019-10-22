package com.example.inten_android_studio

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var nim1: EditText = findViewById(R.id.nim)
        var nama1: EditText = findViewById(R.id.nama)
        var nilai1: EditText = findViewById(R.id.nilai)


        btn_proses.setOnClickListener{

            intent = Intent(this,MainAtivityke2::class.java)
            intent.putExtra("nim",nim1.getText())
            intent.putExtra("nama",nama1.getText())
            intent.putExtra("nilai",nilai1.getText())
            startActivity(intent)
        }

    }
}