package com.bastiangperez.calculaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bastiangperez.calculaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    fun initUI() {
        binding.btnSum.setOnClickListener { sumNums() }
        binding.btnRest.setOnClickListener { restNums() }
        binding.btnMult.setOnClickListener { multNums() }
        binding.btnDiv.setOnClickListener { divNums() }
    }

    fun sumNums() {
        val num1 = binding.etnum1.text.toString()
        val num2 = binding.etnum2.text.toString()
        val num1Fix = num1.toInt()
        val num2Fix = num2.toInt()
        val resultado = num1Fix + num2Fix
        val resultadoString = resultado.toString()
        binding.tvResul.setText(resultadoString)
    }
    fun restNums() {
        val num1 = binding.etnum1.text.toString()
        val num2 = binding.etnum2.text.toString()
        val num1Fix = num1.toInt()
        val num2Fix = num2.toInt()
        val resultado = num1Fix - num2Fix
        val resultadoString = resultado.toString()
        binding.tvResul.setText(resultadoString)
    }
    fun multNums() {
        val num1 = binding.etnum1.text.toString()
        val num2 = binding.etnum2.text.toString()
        val num1Fix = num1.toInt()
        val num2Fix = num2.toInt()
        val resultado = num1Fix * num2Fix
        val resultadoString = resultado.toString()
        binding.tvResul.setText(resultadoString)
    }
    fun divNums() {
        val num1 = binding.etnum1.text.toString()
        val num2 = binding.etnum2.text.toString()
        val num1Fix = num1.toInt()
        val num2Fix = num2.toInt()
        val resultado = num1Fix / num2Fix
        val resultadoString = resultado.toString()
        binding.tvResul.setText(resultadoString)
    }
}