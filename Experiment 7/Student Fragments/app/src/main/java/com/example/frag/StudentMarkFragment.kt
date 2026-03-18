package com.example.frag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class StudentMarkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_student_mark, container, false)

        val etMaths: EditText = view.findViewById(R.id.etMaths)
        val etScience: EditText = view.findViewById(R.id.etScience)
        val etEnglish: EditText = view.findViewById(R.id.etEnglish)
        val etTotal: EditText = view.findViewById(R.id.etTotal)
        val etGrade: EditText = view.findViewById(R.id.etGrade)
        val etStatus: EditText = view.findViewById(R.id.etStatus)
        val btnSubmit: Button = view.findViewById(R.id.btnSubmitMarks)

        btnSubmit.setOnClickListener {
            val maths = etMaths.text.toString()
            val science = etScience.text.toString()
            val english = etEnglish.text.toString()
            val total = etTotal.text.toString()
            val grade = etGrade.text.toString()
            val status = etStatus.text.toString()

            if (maths.isNotEmpty() && science.isNotEmpty() && english.isNotEmpty() &&
                total.isNotEmpty() && grade.isNotEmpty() && status.isNotEmpty()) {
                
                val result = "Maths: $maths, Science: $science, English: $english\nTotal: $total, Grade: $grade, Status: $status"
                Toast.makeText(context, "Marks Saved:\n$result", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(context, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}
