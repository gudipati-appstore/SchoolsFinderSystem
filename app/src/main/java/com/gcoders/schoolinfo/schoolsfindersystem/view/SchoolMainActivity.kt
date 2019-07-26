package com.gcoders.schoolinfo.schoolsfindersystem.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcoders.schoolinfo.schoolsfindersystem.R
import com.gcoders.schoolinfo.schoolsfindersystem.SchoolApplication
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo
import com.gcoders.schoolinfo.schoolsfindersystem.presenter.SchoolListPresenter
import com.gcoders.schoolinfo.schoolsfindersystem.utils.SchoolUtils
import com.gcoders.schoolinfo.schoolsfindersystem.view.adapter.SchoolListAdapter
import org.apache.commons.lang3.StringUtils
import java.util.*

class SchoolMainActivity : AppCompatActivity(), SchoolListInfoViewContract.View {

    private var recyclerview_schools_list: RecyclerView? = null
    private var schoolListPresenter: SchoolListInfoViewContract.Presenter? = null
    private var schoolListInfoObjects: ArrayList<SchoolListInfo>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        schoolListInfoObjects = SchoolApplication.getsInstance()!!.schoolListInfoObjects

        schoolListPresenter = SchoolListPresenter(this)

        recyclerview_schools_list = findViewById(R.id.recyclerview_schools_list)
        recyclerview_schools_list!!.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        schoolListReady(schoolListInfoObjects!!)
    }


    override fun schoolListReady(schoolListInfoObjects: ArrayList<SchoolListInfo>) {
        val adapter = SchoolListAdapter(schoolListInfoObjects, object : SchoolListAdapter.SchoolInfoClickListener {
            override fun onSchoolInfoClick(schoolListInfo: SchoolListInfo) {
                schoolListPresenter!!.getSchoolSATResultInfo(schoolListInfo.dbn!!)
            }
        })
        recyclerview_schools_list!!.adapter = adapter
    }

    override fun schoolInfoClicked(schoolSATResultInfos: ArrayList<SchoolSATResultInfo>) {

        if (null != schoolSATResultInfos && schoolSATResultInfos.size > 0) {
            if (validateSATResults(schoolSATResultInfos)) {
                val intent = Intent(this, SchoolSATscoreActivity::class.java)
                val bundle = Bundle()
                bundle.putParcelable("schoolsatscore", schoolSATResultInfos[0])
                intent.putExtras(bundle)
                startActivity(intent)
            } else {
                onFailure("Incorrect info received. Please try again later..!")
            }
        } else {
            onFailure("No Results found. Please try a different search..!")
        }
    }

    override fun onFailure(errorMessage: String) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
    }

    private fun validateSATResults(schoolSATResultInfos: ArrayList<SchoolSATResultInfo>): Boolean {
        val mSATResultInfo = schoolSATResultInfos[0]
        return if (StringUtils.isNotBlank(mSATResultInfo.dbn)
                && StringUtils.isNotBlank(mSATResultInfo.schoolName)
                && StringUtils.isNotBlank(mSATResultInfo.numOfSatTestTakers) && SchoolUtils.isThisInteger(mSATResultInfo.numOfSatTestTakers!!)
                && StringUtils.isNotBlank(mSATResultInfo.satCriticalReadingAvgScore) && SchoolUtils.isThisInteger(mSATResultInfo.satCriticalReadingAvgScore!!)
                && StringUtils.isNotBlank(mSATResultInfo.satMathAvgScore) && SchoolUtils.isThisInteger(mSATResultInfo.satMathAvgScore!!)
                && StringUtils.isNotBlank(mSATResultInfo.satWritingAvgScore) && SchoolUtils.isThisInteger(mSATResultInfo.satWritingAvgScore!!)) {
            true
        } else false
    }

}
