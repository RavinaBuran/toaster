package com.syngenta.myapplication

import android.content.Context
import android.widget.Toast


object ToasterMessage {
    fun display(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}