package com.example.summer_practice_2022

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.example.summer_practice_2022.databinding.ActivitySplashBinding
import kotlin.random.Random

class SplashActivity : Activity() {

 //   var name: String = ""
 //       set(value) {
 //           val random = Random.nextInt(0,5)
 //           val newValue = "Ответ: $value Random: $random"
 //           textView?.text = newValue
 //           field = newValue
 //       }
    val age: Int = 18

//    private var nameText: EditText? = null
//    private var button: Button? = null
//    private var buttonUpdate: Button? = null
    private var _binding: ActivitySplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        onLoginClick("Summer")
//        val editText: EditText = findViewById(R.id.editText1)
//        button = findViewById(R.id.button)
//        onLoginClick("TEST")

        binding.button.setOnClickListener {

            val enteredName: String = binding.editText1.toString()

            if (enteredName.isEmpty()) {
                Toast.makeText(applicationContext,"Введите имя", Toast.LENGTH_SHORT)
                    .show()
            }

            val enteredHeight: String = binding.editText2.text.toString()

            if (enteredHeight.isEmpty()) {
                Toast.makeText(applicationContext,"Введите рост", Toast.LENGTH_SHORT)
                    .show()
            }

            val enteredWeight: String = binding.editText3.text.toString()

            if (enteredWeight.isEmpty()) {
                Toast.makeText(applicationContext,"Введите вес", Toast.LENGTH_SHORT)
                    .show()
            }

            val enteredAge: String = binding.editText4.text.toString()

            if (enteredAge.isEmpty()) {
                Toast.makeText(applicationContext,"Введите возраст", Toast.LENGTH_SHORT)
                    .show()
            }
            val calories= 88.36 + (13.4 * binding.editText3.text.toString().toFloat()) + (4.8 * binding.editText2.text.toString().toInt()) - (5.7 * binding.editText4.text.toString().toInt())
            val name = binding.editText1.text.toString()
            binding.resultText.text = "$name, Ваша норма потребления калорий: $calories"

            }

        }
//
//        buttonUpdate?.setOnClickListener {
//
//        }

    }

//    fun onLoginClick(newName: String) {
//        val admin = Admin()
//        admin.logMessage()
//
//        Log.e("SplashActivity", name)
//        name = newName
//    }
//}

