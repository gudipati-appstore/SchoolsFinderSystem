package com.gcoders.schoolinfo.schoolsfindersystem.view

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo

import java.util.ArrayList

/**
 * This class represents the SchoolList view interface.
 */
interface SplashContract {

    interface View {

        fun showHomePage()
        fun onFailure(failureMessage: String)
        fun setSchoolListReady(schoolListInfoObjects: ArrayList<SchoolListInfo>)

    }

    interface Presenter {

        fun getSchoolList()


    }
}
