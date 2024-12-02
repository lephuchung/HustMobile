package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        // Use NavController to navigate to Question1Fragment on "Start Quiz"
        view.findViewById<Button>(R.id.start_quiz_button).setOnClickListener {
            findNavController().navigate(R.id.action_welcome_to_question1) // Use the action from the nav_graph
        }

        return view
    }
}
