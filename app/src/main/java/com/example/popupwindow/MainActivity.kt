package com.example.popupwindow

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.LinearLayout
import android.widget.PopupWindow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.more_options -> {
                showPopMenu(View(this))
            }
        }
        return super.onOptionsItemSelected(item)
    }


    private fun showPopMenu(view : View){
        val layout  = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val popupView = layout.inflate(R.layout.pop_up_layout,null)

        val width = LinearLayout.LayoutParams.WRAP_CONTENT
        val height = LinearLayout.LayoutParams.WRAP_CONTENT
        val focusable = true

        val popWindow = PopupWindow(popupView,width,height,focusable)
//        popWindow.showAtLocation(this.findViewById(R.id.content), Gravity.END,0,0)
        popWindow.showAtLocation(view,Gravity.END,0,0)
    }
}