package com.example.inten_android_studio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activityke2_main.*


class MainAtivityke2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityke2_main)

        val bundle= intent.extras
        val nim2 = bundle?.get("nim")
        val nama2 = bundle?.get("nama")
        val nilai2 = bundle?.get("nilai")
        var nilai = nilai2.toString()
        var nilaib = nilai.toInt()

        if (nilaib >= 80){
            keterangan.setText("A")
        }
        else if(nilaib >= 60){
            keterangan.setText("B")
        }
        else if(nilaib >= 40){
            keterangan.setText("C")
        }
        else if(nilaib >= 20){
            keterangan.setText("D")
        }
        else{
            keterangan.setText("E")
        }
        nim_hasil.setText(""+nim2)
        nama_hasil.setText(""+nama2)
        nilai_hasil.setText(""+nilai2)

        button.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }

}