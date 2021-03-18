package com.example.todochallenge.tabs.done

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.todochallenge.databinding.FragmentTodoTabBinding

class ToDoFragment: Fragment() {
	private val binding by lazy {
		FragmentTodoTabBinding.inflate(layoutInflater)
	}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		return binding.root
	}
}