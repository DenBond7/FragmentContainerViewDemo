package com.denbond7.fragmentcontainerview.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.denbond7.fragmentcontainerview.R
import com.denbond7.fragmentcontainerview.BrokenActivity
import kotlinx.android.synthetic.main.layout.*
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

  companion object {
    fun newInstance() = MainFragment()
  }

  private lateinit var viewModel: MainViewModel

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?): View {
    return inflater.inflate(R.layout.main_fragment, container, false)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    // TODO: Use the ViewModel

    buttonWorkActivity?.setOnClickListener {
      startActivity(Intent(requireContext(), BrokenActivity::class.java))
    }

    buttonBrokenActivity?.setOnClickListener {
      startActivity(Intent(requireContext(), BrokenActivity::class.java))
    }
  }

}