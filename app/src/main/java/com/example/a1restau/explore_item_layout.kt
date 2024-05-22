package com.example.a1restau

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.a1restau.databinding.ActivityExploreItemLayoutBinding

class explore_item_layout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore_item_layout)
        var backToHome = findViewById<ImageView>(R.id.backToHome)
        var buyMutton = findViewById<Button>(R.id.buyMutton)
        var buyChap = findViewById<Button>(R.id.buyChap)
        var buyChicken = findViewById<Button>(R.id.buyChicken)
        var buyThali = findViewById<Button>(R.id.buyThali)

        backToHome.setOnClickListener{
            intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
        buyChap.setOnClickListener {
            buyItem("Chicken Chap","150")
        }

        buyMutton.setOnClickListener {
            buyItem("Mutton Biriyani","550")
        }
        buyThali.setOnClickListener {
            buyItem("Bengali Thali","330")
        }
        buyChicken.setOnClickListener {
            buyItem("Chicken Biriyani","330")
        }
    }

    private fun buyItem(itemName: String, itemPrice: String) {
        intent = Intent(applicationContext,PlaceOrder::class.java)
        intent.putExtra("ItemName",itemName)
        intent.putExtra("ItemPrice",itemPrice)
        Toast.makeText(applicationContext,"moving into confirmation page",Toast.LENGTH_SHORT).show()
        startActivity(intent)
    }
}