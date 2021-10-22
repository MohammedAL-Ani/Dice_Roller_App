package com.example.mango.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.mango.databinding.FragmentHomeBinding
import com.example.mango.viewmodel.ViewModelRollDice


class HomeFragment : Fragment() {

    lateinit var binding : FragmentHomeBinding

    private  val  viewModel: ViewModelRollDice by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

}