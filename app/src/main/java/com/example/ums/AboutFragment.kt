package com.example.ums

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ums.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {
    private val binding by lazy { FragmentAboutBinding.inflate(layoutInflater) }
    lateinit var user: User
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        user = arguments?.getSerializable("keyUser") as User
        binding.textAbout.text = user.name
        binding.textAbout2.text = user.maluot
        binding.raqam.text = user.code
        return binding.root
    }


}