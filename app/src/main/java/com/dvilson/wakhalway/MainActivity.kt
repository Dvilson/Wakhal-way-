package com.dvilson.wakhalway

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import io.getstream.chat.android.client.ChatClient

class MainActivity : AppCompatActivity() {
    private lateinit var navController:NavController
    private val client = ChatClient.instance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // navController = findNavController(R.id.nav_host_fragment)
        //navController.currentDestination?.label.toString().contains("auth"){


        }

    }
