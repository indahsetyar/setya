package com.indahserba.app.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.indahserba.app.R
import com.indahserba.app.databinding.ActivityMainBinding
import com.indahserba.app.ui.auth.AuthActivity
import com.indahserba.app.ui.auth.IndahserbaAuth

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonLogout.setOnClickListener {
            IndahserbaAuth.logout(this) {
                startActivity(Intent( this, AuthActivity::class.java))
                finish()
            }
        }
    }
}