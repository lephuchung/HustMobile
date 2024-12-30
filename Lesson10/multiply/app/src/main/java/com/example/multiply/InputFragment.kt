package com.example.multiply

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.findNavController

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class InputFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_input, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button: Button = view.findViewById(R.id.bt_multiply)
        val number1: EditText = view.findViewById(R.id.number1)
        val number2: EditText = view.findViewById(R.id.number2)
        button.setOnClickListener {
            //Toast.makeText(this.requireContext(), n1.toString(), Toast.LENGTH_SHORT).show()
            val n1:Float = number1.text.toString().toFloatOrNull() ?: 0.0f
            val n2:Float = number2.text.toString().toFloatOrNull() ?: 0.0f

            //view.findNavController().navigate(R.id.action_inputFragment_to_multiplyFragment)
            val action =
                InputFragmentDirections.actionInputFragmentToMultiplyFragment(n1, n2)
            view.findNavController().navigate(action)
        }
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            InputFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}