package com.example.democi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.democi.databinding.ActivityMainBinding
import com.tan.sdk.DemoSDK

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            toast1.setOnClickListener {
                DemoSDK.showToast1(this@MainActivity)
            }

            toast2.setOnClickListener {
                DemoSDK.showToast2(this@MainActivity)
            }

            toast3.setOnClickListener {
                DemoSDK.showToast3(this@MainActivity)
            }
        }
    }
}