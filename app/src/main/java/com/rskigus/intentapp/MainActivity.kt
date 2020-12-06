package com.rskigus.intentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.rskigus.intentapp.model.User
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

        btn_intent_parcelable.setOnClickListener {
            val parcelIntent = Intent(this@MainActivity, ParcleActivity::class.java)
            val user = User("Gitar Listrik", "5 Kg", "Gitar terbaik sepanjanng msa dengan harga terjagkau")
            parcelIntent.putExtra(ParcleActivity.EXTRA_USER, user)
            startActivity(parcelIntent)
        }

        btn_implicit_intent.setOnClickListener {
            val phoneNumber = "089668340021"
            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:$phoneNumber"))
            intent.putExtra("sms_body", "Hayukkkkk cari tau")
            startActivity(intent)
        }
    }
}
