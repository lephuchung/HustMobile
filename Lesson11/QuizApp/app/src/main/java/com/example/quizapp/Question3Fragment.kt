package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Question3Fragment : Fragment() {

    private var selectedAnswer: Int? = null // Lưu trữ đáp án đã chọn
    private var isCorrectAnswerSelected = false // Cờ theo dõi nếu đáp án đúng được chọn

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_question3, container, false)

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
                navigateToResult()
            }
        }

        // Xử lý nút Back
        view.findViewById<Button>(R.id.back_button).setOnClickListener {
            findNavController().navigateUp() // Quay lại trang trước
        }

        return view
    }

    override fun onResume() {
        super.onResume()
        // Đặt lại biến isQuestion1Correct về 0 mỗi khi truy cập Question1Fragment
        (activity as? MainActivity)?.isQuestion3Correct = 0
    }

    private fun selectAnswer(answer: Int, isCorrect: Boolean) {
        selectedAnswer = answer // Lưu lại đáp án đã chọn
        isCorrectAnswerSelected = isCorrect // Cập nhật trạng thái nếu là đáp án đúng
        Toast.makeText(context, "Bạn đã chọn đáp án $answer", Toast.LENGTH_SHORT).show()
    }

    private fun navigateToResult() {
        val mainActivity = activity as MainActivity

        // Cập nhật điểm nếu đáp án đúng
        if (isCorrectAnswerSelected) {
            mainActivity.isQuestion3Correct = 1
        }

        // Điều hướng đến ResultFragment mà không cần truyền tham số nữa
        findNavController().navigate(R.id.action_question3_to_result)
    }
}

