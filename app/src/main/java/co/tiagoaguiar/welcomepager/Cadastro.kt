package co.tiagoaguiar.welcomepager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.tiagoaguiar.welcomepager.R
import android.content.Intent
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

import co.tiagoaguiar.welcomepager.Cadastro
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_cadastro.view.*

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)



        val items = listOf("Masculino", "Feminino")
        val adapter = ArrayAdapter(this, R.layout.list_item, items)

    }

    fun proximaTela(view: View?) {
        val intent = Intent(this, Cadastro::class.java)
        startActivity(intent)
    }

    companion object {
        private val COUNTRIES = arrayOf(
            "Masculino", "Feminino"
        )
    }
}