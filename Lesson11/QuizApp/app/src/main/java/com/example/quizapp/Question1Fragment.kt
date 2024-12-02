package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Question1Fragment : Fragment() {

    private var selectedAnswer: Int? = null // Lưu trữ lựa chọn của người dùng
    private var isCorrectAnswerSelected = false // Cờ để theo dõi nếu đáp án đúng được chọn

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_question1, container, false)

        // Xử lý khi chọn đáp án
        view.findViewById<Button>(R.id.option_1_button).setOnClickListener {
            selectAnswer(1, false) // Đáp án sai
        }

        view.findViewById<Button>(R.id.option_2_button).setOnClickListener {
            selectAnswer(2, true) // Đáp án đúng
        }

        view.findViewById<Button>(R.id.option_3_button).setOnClickListener {
            selectAnswer(3, false) // Đáp án sai
        }

        view.findViewById<Button>(R.id.option_4_button).setOnClickListener {
            selectAnswer(4, false) // Đáp án sai
        }

        // Xử lý nút Submit
        view.findViewById<Button>(R.id.submit_button).setOnClickListener {
            if (selectedAnswer == null) {
                Toast.makeText(context, "Hãy chọn một đáp án trước khi tiếp tục!", Toast.LENGTH_SHORT).show()
            } else {
                navigateToNextQuestion()
            }
        }

        // Xử lý nút Back
        view.findViewById<Button>(R.id.back_button).setOnClickListener {
            findNavController().navigateUp() // Quay lại trang trước
        }

        return view
    }

    private fun selectAnswer(answer: Int, isCorrect: Boolean) {
        selectedAnswer = answer // Lưu trữ đáp án được chọn
        isCorrectAnswerSelected = isCorrect // Cập nhật trạng thái nếu đáp án đúng
        Toast.makeText(context, "Bạn đã chọn đáp án $answer", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        // Đặt lại biến isQuestion1Correct về 0 mỗi khi truy cập Question1Fragment
        (activity as? MainActivity)?.isQuestion1Correct = 0
    }


    private fun navigateToNextQuestion() {
        val mainActivity = activity as MainActivity

        if (isCorrectAnswerSelected) {
            mainActivity.isQuestion1Correct = 1
        }

        findNavController().navigate(R.id.action_question1_to_question2)
    }
}
