package com.example.harshsirrelativelayout

import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LivingRoomActivity : AppCompatActivity() {

    private lateinit var seekBar: SeekBar
    private lateinit var progressTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_living_room)
        val text : TextView = findViewById(R.id.tv1)
        val model = intent.getSerializableExtra("Name") as CardData
        text.text = model.header


        seekBar = findViewById(R.id.seekBar)
        progressTextView = findViewById(R.id.progressTextView)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                progressTextView.text = "Progress: $progress"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }

        })

    }
}