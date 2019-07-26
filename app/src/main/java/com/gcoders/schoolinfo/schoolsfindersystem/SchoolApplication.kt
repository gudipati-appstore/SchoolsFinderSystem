package com.gcoders.schoolinfo.schoolsfindersystem

import android.app.Application
import android.content.Intent

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo
import com.gcoders.schoolinfo.schoolsfindersystem.view.SplashActivity

import java.util.ArrayList

class SchoolApplication : Application() {
    var schoolListInfoObjects: ArrayList<SchoolListInfo>? = null
        private set

    override fun onCreate() {
        super.onCreate()
        initAppInstance()
    }

    private fun initAppInstance() {
        if (sInstance == null) {
            sInstance = this
        }
    }

    fun storeSchoolListObject(schoolListInfoObjects: ArrayList<SchoolListInfo>) {
        this.schoolListInfoObjects = schoolListInfoObjects
    }

    fun clearSchoolObjects() {
        this.schoolListInfoObjects!!.clear()
    }

    companion object {

        private var sInstance: SchoolApplication? = null

        fun getsInstance(): SchoolApplication? {
            return sInstance
        }
    }
}
