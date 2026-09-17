package com.example.studentprofilecard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studentprofilecard.databinding.ActivityMainBinding
import com.example.studentprofilecard.model.Student
import com.example.studentprofilecard.utils.toAcademicRanking
import com.example.studentprofilecard.utils.toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var currentStudent = Student(
        id = "2415053122204",
        name = "Võ Văn Thành Đạt",
        className = "Lớp của bạn",
        email = "Anhhungbodon@gmail.com",
        gpa = 3.2
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindStudentData()

        binding.btnUpdateGpa.setOnClickListener {
            val newGpa = binding.edtNewGpa.text.toString().toDoubleOrNull()

            if (newGpa != null && newGpa in 0.0..4.0) {
                currentStudent = currentStudent.copy(gpa = newGpa)
                bindStudentData()
                toast("Cập nhật GPA thành công")
            } else {
                toast("GPA phải từ 0.0 đến 4.0")
            }
        }
    }

    private fun bindStudentData() {
        binding.tvName.text = currentStudent.name
        binding.tvStudentId.text = "MSSV: ${currentStudent.id}"
        binding.tvGpaBadge.text =
            "GPA: ${currentStudent.gpa} - ${currentStudent.gpa.toAcademicRanking()}"
    }
}