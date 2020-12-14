package com.indahserba.app.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.indahserba.app.R
import com.indahserba.app.data.model.AuthUser
import com.indahserba.app.databinding.ActivityAuthBinding
import com.indahserba.app.ui.home.MainActivity

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }

    fun onSuccess(user: AuthUser?) {
    val intent = Intent( this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}