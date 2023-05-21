package com.example.lab1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fish1 = Animal( "Tom", "Fugu fish")
        val fish2 = Animal("Bob", "Red fish")
        val fish3 = Animal("Andre", "Small gold fish")
        fish1?.let {
            val cat1Str = "${fish1.name}"
            val cat1StrAge = "${fish1.disc}"
            binding.tvName1.text = cat1StrAge
            binding.tvDesc1.text = cat1Str
        }

        fish2?.let {
            val cat2Str = "${fish2.name}"
            val cat2StrAge = "${fish2.disc}"
            binding.tvName2.text = cat2StrAge
            binding.tvDesc2.text = cat2Str

        }

        fish3?.let {
            val cat3Str = "${fish3.name}"
            val cat3StrAge = "${fish3.disc}"
            binding.tvName3.text = cat3StrAge
            binding.tvDesc3.text = cat3Str
        }

        binding.button1.setOnClickListener {
            val intent1 = Intent(this, SecondActivity::class.java)
            intent1.putExtra(Fish_Key1, fish1)
            startActivity(intent1)
        }

        binding.button2.setOnClickListener {
            val intent2 = Intent(this, SecondActivity::class.java)
            intent2.putExtra(Fish_Key2, fish2)
            startActivity(intent2)
        }

        binding.button3.setOnClickListener {
            val intent3 = Intent(this, SecondActivity::class.java)
            intent3.putExtra(Fish_Key3, fish3)
            startActivity(intent3)
        }
    }

    companion object {
        val Fish_Key1 = "fish_1"
        val Fish_Key2 = "fish_2"
        val Fish_Key3 = "fish_3"
    }
}