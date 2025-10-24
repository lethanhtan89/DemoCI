package com.tan.sdk

import android.content.Context
import android.widget.Toast

object DemoSDK {
    fun showToast1(context: Context) {
        Toast.makeText(context, "showToast", Toast.LENGTH_SHORT).show()
    }

    fun showToast2(context: Context) {
        Toast.makeText(context, "showToast2", Toast.LENGTH_SHORT).show()
    }

    fun showToast3(context: Context) {
        Toast.makeText(context, "showToast3", Toast.LENGTH_SHORT).show()
    }
}