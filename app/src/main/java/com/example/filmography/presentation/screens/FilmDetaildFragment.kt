package com.example.filmography.presentation.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.filmography.R
import com.example.filmography.databinding.FragmentFilmDetaildBinding


class FilmDetaildFragment : Fragment() {
    private lateinit var binding: FragmentFilmDetaildBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFilmDetaildBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
            it.findNavController().navigate(R.id.action_filmDetaildFragment_to_filmGenerateFragment)
        }
    }



}