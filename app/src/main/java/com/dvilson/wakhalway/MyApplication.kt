package com.dvilson.wakhalway

import android.app.Application
import io.getstream.chat.android.client.ChatClient
import io.getstream.chat.android.client.logger.ChatLogLevel

class MyApplication: Application (){
    override fun onCreate() {
        super.onCreate()
        val client =
            ChatClient.Builder(apiKey = getString(R.string.api_key),appContext = this).logLevel(ChatLogLevel.ALL).build()

    }

}