package com.example.frag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class StudentBasicDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_student_basic_details, container, false)

        val etName: EditText = view.findViewById(R.id.etName)
        val etAge: EditText = view.findViewById(R.id.etAge)
        val etAddress: EditText = view.findViewById(R.id.etAddress)
        val btnSubmit: Button = view.findViewById(R.id.btnSubmitDetails)

        btnSubmit.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString()
            val address = etAddress.text.toString()

            if (name.isNotEmpty() && age.isNotEmpty() && address.isNotEmpty()) {
                Toast.makeText(context, "Saved: $name, $age, $address", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}
