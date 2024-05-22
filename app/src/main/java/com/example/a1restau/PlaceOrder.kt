package com.example.a1restau

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PlaceOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_order)
        var placeOrderBtn = findViewById<Button>(R.id.placedOrderBtn)
        var orderItemName = findViewById<TextView>(R.id.orderedItemName)
        var orderItemPrice = findViewById<TextView>(R.id.OrderTotalValue)

        placeOrderBtn.setOnClickListener {
            intent = Intent(applicationContext,ConfirmedOrderPage::class.java)
            startActivity(intent)
        }
        orderItemName.text = intent.getStringExtra("ItemName")
        orderItemPrice.text = intent.getStringExtra("ItemPrice")
    }
}