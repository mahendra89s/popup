package com.example.popupwindow

import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity

class PopWindow(context: AppCompatActivity) : PopupWindow() {

    init {
        val layout: LayoutInflater = context.getSystemService(AppCompatActivity.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        contentView = layout.inflate(R.layout.pop_up_layout, null)
        width = LinearLayout.LayoutParams.WRAP_CONTENT
        height = LinearLayout.LayoutParams.WRAP_CONTENT
        isFocusable = false
    }

    fun showUp(view : View){
        val gravity : Int = Gravity.TOP or Gravity.RIGHT
        showAtLocation(view, gravity,0,0)
    }
}