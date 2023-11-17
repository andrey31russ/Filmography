package com.example.filmography.presentation.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.filmography.R
import com.example.filmography.databinding.FragmentFilmGenerateBinding

class FilmGenerateFragment : Fragment() {
    private lateinit var binding: FragmentFilmGenerateBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFilmGenerateBinding.inflate(layoutInflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button2.setOnClickListener {
            it.findNavController().navigate(R.id.action_filmGenerateFragment_to_filmDetaildFragment)
        }
    }

}