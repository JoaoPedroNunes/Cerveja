package com.example.cervejinha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalcular.setOnClickListener(View.OnClickListener {
            val preco1 = preco1in.text.toString()
            val preco2 = preco2in.text.toString()
            val preco3 = preco3in.text.toString()
            val ml1 = ml1in.text.toString()
            val ml2 = ml2in.text.toString()
            val ml3 = ml3in.text.toString()

            if (preco1.isEmpty() && ml1.isEmpty()) {
                resultado1.text = getString(R.string.resultText)
            } else if (preco1.isEmpty()) {
                Toast.makeText(this,getString(R.string.precoMissing), Toast.LENGTH_LONG).show()
            } else if (ml1.isEmpty()) {
                Toast.makeText(this,getString(R.string.mlMissing), Toast.LENGTH_LONG).show()
            } else resultado1.text = Calculo.ml(preco1.toDouble(), ml1.toDouble())

            if (preco2.isEmpty() && ml2.isEmpty()) {
                resultado2.text = getString(R.string.resultText)
            } else if (preco2.isEmpty()) {
                Toast.makeText(this,getString(R.string.precoMissing), Toast.LENGTH_LONG).show()
            } else if (ml2.isEmpty()) {
                Toast.makeText(this,getString(R.string.mlMissing), Toast.LENGTH_LONG).show()
            } else resultado1.text = Calculo.ml(preco2.toDouble(), ml2.toDouble())

            if (preco3.isEmpty() && ml3.isEmpty()) {
                resultado3.text = getString(R.string.resultText)
            } else if (preco3.isEmpty()) {
                Toast.makeText(this,getString(R.string.precoMissing), Toast.LENGTH_LONG).show()
            } else if (ml3.isEmpty()) {
                Toast.makeText(this,getString(R.string.mlMissing), Toast.LENGTH_LONG).show()
            } else resultado3.text = Calculo.ml(preco3.toDouble(), ml3.toDouble())
        })
    }
}
