package com.example.cervejinha

class Calculo{
    companion object{
        fun ml(preco: Double, ml: Double): String {
            val result =preco/ml
            return String.format("%.4f", result)
        }
    }
}