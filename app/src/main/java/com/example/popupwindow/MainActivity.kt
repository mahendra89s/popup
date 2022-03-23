package com.example.popupwindow

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.popupwindow.editPayment.EditPaymentFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEditPayment.setOnClickListener {
            EditPaymentFragment().show(supportFragmentManager,"DialogFragment")
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.more_options -> {
                val parentView = View(this)
                PopWindow(this).showUp(parentView)
            }
        }
        return super.onOptionsItemSelected(item)
    }



}