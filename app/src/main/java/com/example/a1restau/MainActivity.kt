package com.example.a1restau

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a1restau.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.exploreItem.setOnClickListener {
            goToItemLayout()
        }
        binding.breakfastCard.setOnClickListener {
            goToItemLayout()
        }
        binding.dinnerCard.setOnClickListener {
            goToItemLayout()
        }
        binding.lunchCard.setOnClickListener {
            goToItemLayout()
        }
    }

    private fun goToItemLayout() {
        intent = Intent(this,explore_item_layout::class.java)
        startActivity(intent)
    }
}