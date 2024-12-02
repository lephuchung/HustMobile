package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ResultFragment : Fragment() {

    private var correctAnswers: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result, container, false)

        // Lấy tổng điểm từ MainActivity
        val mainActivity = activity as MainActivity
        correctAnswers = mainActivity.isQuestion1Correct + mainActivity.isQuestion2Correct + mainActivity.isQuestion3Correct

        // Hiển thị kết quả
        val resultTextView = view.findViewById<TextView>(R.id.result_text_view)
        resultTextView.text = "You got $correctAnswers correct answers!"

        // Xử lý nút "Back to Home"
        view.findViewById<Button>(R.id.back_to_home_button).setOnClickListener {
            // Đặt lại điểm số về 0 trong MainActivity
            mainActivity.correctAnswers = 0

            // Điều hướng về WelcomeFragment
            findNavController().navigate(R.id.action_result_to_welcome)
        }

        // Xử lý nút "Exit"
        view.findViewById<Button>(R.id.exit_button).setOnClickListener {
            // Đóng ứng dụng
            activity?.finish()
            System.exit(0)
        }

        return view
    }
}

