package com.gcoders.schoolinfo.schoolsfindersystem.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.gcoders.schoolinfo.schoolsfindersystem.R;
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo;

public class SchoolSATscoreActivity extends AppCompatActivity {

    private SchoolSATResultInfo schoolSATResultsInfo;
    private TextView textview_school_name_text;
    private TextView textview_school_code_text;
    private TextView textview_school_sat_test_takers_numbers;
    private TextView textview_school_sat_math_test_avgscore_number;
    private TextView textview_school_sat_reading_test_avgscore_number;
    private TextView textview_school_sat_writing_test_avgscore_number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.school_sat_result_info);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        checkForSchoolSATResultsInfo();

        bindViews();
        bindValues();

    }

    private void bindViews() {
        textview_school_name_text = findViewById(R.id.textview_school_name_text);
        textview_school_code_text = findViewById(R.id.textview_school_code_text);
        textview_school_sat_test_takers_numbers = findViewById(R.id.textview_school_sat_test_takers_numbers);
        textview_school_sat_math_test_avgscore_number = findViewById(R.id.textview_school_sat_math_test_avgscore_number);
        textview_school_sat_reading_test_avgscore_number = findViewById(R.id.textview_school_sat_reading_test_avgscore_number);
        textview_school_sat_writing_test_avgscore_number = findViewById(R.id.textview_school_sat_writing_test_avgscore_number);
    }

    private void bindValues() {
        if (null != schoolSATResultsInfo) {
            textview_school_name_text.setText(schoolSATResultsInfo.getSchoolName());
            textview_school_code_text.setText(schoolSATResultsInfo.getDbn());
            textview_school_sat_test_takers_numbers.setText(schoolSATResultsInfo.getNumOfSatTestTakers());
            textview_school_sat_math_test_avgscore_number.setText(schoolSATResultsInfo.getSatMathAvgScore());
            textview_school_sat_reading_test_avgscore_number.setText(schoolSATResultsInfo.getSatCriticalReadingAvgScore());
            textview_school_sat_writing_test_avgscore_number.setText(schoolSATResultsInfo.getSatWritingAvgScore());
        }
    }

    private void checkForSchoolSATResultsInfo() {

        if (null != getIntent().getSerializableExtra("schoolsatscore")) {
            SchoolSATResultInfo schoolSATResultInfo = (SchoolSATResultInfo) getIntent().getSerializableExtra("schoolsatscore");
            if (null != schoolSATResultInfo) {
                schoolSATResultsInfo = schoolSATResultInfo;
            }
        }
    }

}
