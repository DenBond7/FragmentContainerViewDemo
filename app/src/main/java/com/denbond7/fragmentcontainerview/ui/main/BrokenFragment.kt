package com.denbond7.fragmentcontainerview.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denbond7.fragmentcontainerview.R

class BrokenFragment : Fragment() {

    companion object {
        fun newInstance() = BrokenFragment()
    }

    private lateinit var viewModel: BrokenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.broken_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BrokenViewModel::class.java)
        // TODO: Use the ViewModel
    }

}