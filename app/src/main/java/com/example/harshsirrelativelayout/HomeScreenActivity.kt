package com.example.harshsirrelativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeScreenActivity : AppCompatActivity() {

    private lateinit var cardRecyclerView: RecyclerView
    private lateinit var cardArrayList : ArrayList<CardData>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var devices: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)


        imageId = arrayOf(
            R.drawable.apartment,
            R.drawable.bed,
            R.drawable.dumbbell,
            R.drawable.home,
            R.drawable.interior_design,
            R.drawable.kitchen,
            R.drawable.shop,
            R.drawable.swimming_pool,
            R.drawable.room_heater,
            R.drawable.tv

        )

        heading = arrayOf(
            "Bathroom",
            "BedRoom",
            "Gym",
            "Roof",
            "LivingRoom",
            "Kitchen",
            "Garage",
            "Swimming pool",
            "Room Heater",
            "Television"
        )
        devices = arrayOf(
            "2 devices ",
            "4 devices ",
            "1 devices ",
            "3 devices ",
            "8 devices ",
            "3 devices ",
            "5 devices ",
            "4 devices ",
            "2 devices ",
            "1 devices "
        )

        cardRecyclerView = findViewById(R.id.recyclerView)
        cardRecyclerView.layoutManager = GridLayoutManager(this,2)
        cardRecyclerView.setHasFixedSize(true)

        cardArrayList = arrayListOf<CardData>()

        userData()

    }

    private fun userData()  {
        for(i in imageId.indices){


            val data = CardData(imageId[i], heading[i],devices[i])
            cardArrayList.add(data)
        }

        cardRecyclerView.adapter = CardAdapter(this@HomeScreenActivity,cardArrayList)

    }
}