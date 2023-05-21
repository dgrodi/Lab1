package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.lab1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fish1 = intent.getParcelableExtra<Animal>(MainActivity.Fish_Key1)
        val fish2 = intent.getParcelableExtra<Animal>(MainActivity.Fish_Key2)
        val fish3 = intent.getParcelableExtra<Animal>(MainActivity.Fish_Key3)
        fish1?.let {
            val catStr =
                "He is ${fish1.name}, he is ${fish1.disc}, and he is very nervous"
            binding.full.text = catStr
            binding.image.setImageResource(R.drawable.fish1)

        }

        fish2?.let {
            val catStr =
                "He is ${fish2.name}, he is ${fish2.disc}, and he is in shock"
            binding.full.text = catStr
            binding.image.setImageResource(R.drawable.fish2)

        }

        fish3?.let {
            val catStr =
                "He is ${fish3.name}, he is ${fish3.disc}. He is very ugly and weak"
            binding.full.text = catStr
            binding.image.setImageResource(R.drawable.fish3)

        }
        binding.button4.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}