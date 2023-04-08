package com.drovo.expandablerecyclerviewtest

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.drovo.expandablerecyclerviewtest.adapter.MainAdapter
import com.drovo.expandablerecyclerviewtest.databinding.ActivityMainBinding
import com.drovo.expandablerecyclerviewtest.fakedata.SampleData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            recyclerviwMain.adapter = MainAdapter(SampleData.collections)
        }
    }
}