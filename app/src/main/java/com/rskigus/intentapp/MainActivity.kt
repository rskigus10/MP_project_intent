package com.rskigus.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_profile.setOnClickListener {
            val profile = Intent(this@MainActivity,ProfilActivity::class.java)
            startActivity(profile)
        }

        btn_produk.setOnClickListener{
            val dataIntent = Intent(this@MainActivity,ProdukActivity::class.java)
            dataIntent.putExtra(ProdukActivity.EXTRA_PRODUK, "Gitar Listrik")
            dataIntent.putExtra(ProdukActivity.EXTRA_BERAT, "5 Kg")
            dataIntent.putExtra(ProdukActivity.EXTRA_DETAIL, "Gitar terbaik sepanjang masa dengan harga terjangkau")
            startActivity(dataIntent)
        }
    }
}
