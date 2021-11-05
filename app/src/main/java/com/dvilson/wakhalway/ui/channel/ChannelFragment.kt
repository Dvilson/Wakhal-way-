package com.dvilson.wakhalway.ui.channel

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dvilson.wakhalway.R

class ChannelFragment : Fragment() {

    companion object {
        fun newInstance() = ChannelFragment()
    }

    private lateinit var viewModel: ChannelViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.channel_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChannelViewModel::class.java)
        // TODO: Use the ViewModel
    }

}