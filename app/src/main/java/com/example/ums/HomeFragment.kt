package com.example.ums

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.ums.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.apply {
            shop.setOnClickListener{
                findNavController().navigate(R.id.homeFragmentToFragmentCustom, bundleOf("tarif" to 0 ))
            }
            time.setOnClickListener{
                findNavController().navigate(R.id.homeFragmentToFragmentCustom, bundleOf("tarif" to 1 ))
            }
            internet.setOnClickListener{
                findNavController().navigate(R.id.homeFragmentToFragmentCustom, bundleOf("tarif" to 2 ))
            }
            sms.setOnClickListener {
                findNavController().navigate(R.id.homeFragmentToFragmentCustom, bundleOf("tarif" to 3 ))
            }

        }
        return binding.root
    }



}