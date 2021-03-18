package com.example.todochallenge.tabs.todo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.todochallenge.databinding.FragmentDoneTabBinding

class DoneFragment: Fragment() {

	private val binding by lazy {
		FragmentDoneTabBinding.inflate(layoutInflater)
	}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		return binding.root
	}
}