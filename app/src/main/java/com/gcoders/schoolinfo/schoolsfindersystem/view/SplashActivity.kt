package com.gcoders.schoolinfo.schoolsfindersystem.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

import com.gcoders.schoolinfo.schoolsfindersystem.R
import com.gcoders.schoolinfo.schoolsfindersystem.SchoolApplication
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo
import com.gcoders.schoolinfo.schoolsfindersystem.presenter.SplashPresenter

import java.util.ArrayList

class SplashActivity : AppCompatActivity(), SplashContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val presenter = SplashPresenter(this)
        if (null == SchoolApplication.getsInstance()!!.schoolListInfoObjects) {
            presenter.getSchoolList()
        } else {
            setSchoolListReady(SchoolApplication.getsInstance()!!.schoolListInfoObjects!!)
        }
    }


    override fun showHomePage() {
        val intent = Intent(this, SchoolMainActivity::class.java)
        startActivity(intent)
    }

    override fun onFailure(failureMessage: String) {
        Toast.makeText(this, failureMessage, Toast.LENGTH_SHORT).show()
    }

    override fun setSchoolListReady(schoolListInfoObjects: ArrayList<SchoolListInfo>) {
        SchoolApplication.getsInstance()!!.storeSchoolListObject(schoolListInfoObjects)
        showHomePage()
    }

}
