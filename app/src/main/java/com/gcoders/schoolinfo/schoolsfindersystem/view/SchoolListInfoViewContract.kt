package com.gcoders.schoolinfo.schoolsfindersystem.view

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo

import java.util.ArrayList

/**
 * This class represents the SchoolList view interface.
 */
interface SchoolListInfoViewContract {

    interface View {

        fun schoolListReady(schoolListInfos: ArrayList<SchoolListInfo>)

        fun schoolInfoClicked(schoolSATResultInfos: ArrayList<SchoolSATResultInfo>)

        fun onFailure(message: String)
    }

    interface Presenter {

        fun getSchoolSATResultInfo(schoolCode: String)
    }
}
