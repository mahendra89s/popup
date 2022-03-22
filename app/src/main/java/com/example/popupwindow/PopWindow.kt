package com.example.popupwindow

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate

import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getSystemService

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