package com.example.mytoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.megtoast.MegToast
import com.example.megtoast.MegToastTypes
import com.example.mytoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonSuccess.setOnClickListener {
            MegToast.makeToast(this ,
                MegToastTypes.SUCCESS ,
                "Network" ,
                "Network is successful",
                durationInSeconds = 5)


        }

        binding.buttonError.setOnClickListener {
            MegToast.makeToast(
                this ,
                MegToastTypes.ERROR ,
                "Network" ,
                "There is an error in network.",
                durationInSeconds = 3
            )
        }
    }

}