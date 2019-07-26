package com.gcoders.schoolinfo.schoolsfindersystem.view

import android.os.Bundle
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.View
import android.widget.Button
import android.widget.TextView

import com.gcoders.schoolinfo.schoolsfindersystem.R
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo

class SchoolSATscoreActivity : AppCompatActivity() {

    private var schoolSATResultsInfo: SchoolSATResultInfo? = null
    private var textview_school_name_text: TextView? = null
    private var textview_school_code_text: TextView? = null
    private var textview_school_sat_test_takers_numbers: TextView? = null
    private var textview_school_sat_math_test_avgscore_number: TextView? = null
    private var textview_school_sat_reading_test_avgscore_number: TextView? = null
    private var textview_school_sat_writing_test_avgscore_number: TextView? = null
    private var btn_goback: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.school_sat_result_info)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        checkForSchoolSATResultsInfo()

        bindViews()
        bindEvents()
        bindValues()

    }

    private fun bindViews() {
        textview_school_name_text = findViewById(R.id.textview_school_name_text)
        textview_school_code_text = findViewById(R.id.textview_school_code_text)
        textview_school_sat_test_takers_numbers = findViewById(R.id.textview_school_sat_test_takers_numbers)
        textview_school_sat_math_test_avgscore_number = findViewById(R.id.textview_school_sat_math_test_avgscore_number)
        textview_school_sat_reading_test_avgscore_number = findViewById(R.id.textview_school_sat_reading_test_avgscore_number)
        textview_school_sat_writing_test_avgscore_number = findViewById(R.id.textview_school_sat_writing_test_avgscore_number)
        btn_goback = findViewById(R.id.btn_goback)
    }

    private fun bindEvents() {
        btn_goback!!.setOnClickListener { finish() }
    }

    private fun bindValues() {
        if (null != schoolSATResultsInfo) {
            textview_school_name_text!!.text = schoolSATResultsInfo!!.schoolName
            textview_school_code_text!!.text = schoolSATResultsInfo!!.dbn
            textview_school_sat_test_takers_numbers!!.text = schoolSATResultsInfo!!.numOfSatTestTakers
            textview_school_sat_math_test_avgscore_number!!.text = schoolSATResultsInfo!!.satMathAvgScore
            textview_school_sat_reading_test_avgscore_number!!.text = schoolSATResultsInfo!!.satCriticalReadingAvgScore
            textview_school_sat_writing_test_avgscore_number!!.text = schoolSATResultsInfo!!.satWritingAvgScore
        }
    }

    private fun checkForSchoolSATResultsInfo() {

        if (null != intent.getSerializableExtra("schoolsatscore")) {
            val schoolSATResultInfo = intent.getParcelableExtra<Parcelable>("schoolsatscore") as SchoolSATResultInfo
            if (null != schoolSATResultInfo) {
                schoolSATResultsInfo = schoolSATResultInfo
            }
        }
    }

}
