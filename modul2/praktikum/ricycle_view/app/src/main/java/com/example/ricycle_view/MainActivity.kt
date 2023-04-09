package com.example.ricycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var recyclerViewBusAdapter : RecyclerViewBusAdapter? = null
    private var busList = mutableListOf<bus>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        busList = ArrayList()

        recyclerView = findViewById<View>(R.id.rvBusLists) as RecyclerView
        recyclerViewBusAdapter = RecyclerViewBusAdapter(this@MainActivity, busList)
        val layoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewBusAdapter

        prepareBusListDate()



    }

    private fun prepareBusListDate() {
        var bus = bus("Agam Tunggal Jaya 1", R.drawable.busatj1)
        busList.add(bus)
        bus = bus("Agam Tunggal Jaya 2", R.drawable.busatj2)
        busList.add(bus)

        bus = bus("Agam Tunggal Jaya 3", R.drawable.busatj3)
        busList.add(bus)

        bus = bus("Agam Tunggal Jaya 4", R.drawable.busatj4)
        busList.add(bus)

        bus = bus("Agam Tunggal Jaya 5", R.drawable.busatj5)
        busList.add(bus)

        bus = bus("Subur Jaya 1", R.drawable.bussuburjaya1)
        busList.add(bus)

        bus = bus("Subur Jaya 2", R.drawable.bussuburjaya2)
        busList.add(bus)

        bus = bus("Subur Jaya 3", R.drawable.bussuburjaya22)
        busList.add(bus)

        bus = bus("Subur Jaya 4", R.drawable.bussuburjaya3)
        busList.add(bus)

        bus = bus("Subur Jaya 5", R.drawable.bussuburjaya4)
        busList.add(bus)

        bus = bus("Subur Jaya 6", R.drawable.bussuburjaya5)
        busList.add(bus)

        bus = bus("Subur Jaya 7", R.drawable.bussuburjaya6)
        busList.add(bus)
    }
}