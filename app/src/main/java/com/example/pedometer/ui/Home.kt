package com.example.pedometer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.pedometer.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Home : Fragment() {
    private var binding:FragmentHomeBinding?=null
    private val homeViewModel:HomeViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(inflater,container,false)
            .apply {

            }
        setObservers()
        return binding!!.root
    }

    private fun setObservers() {
        homeViewModel.btnGetStartedClicked.observe(viewLifecycleOwner, Observer {
            if (it==true){

            }
        })
    }

    companion object {

    }
}