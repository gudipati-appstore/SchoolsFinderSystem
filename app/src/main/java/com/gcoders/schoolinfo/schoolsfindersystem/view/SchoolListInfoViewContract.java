package com.gcoders.schoolinfo.schoolsfindersystem.view;

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo;
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo;

import java.util.ArrayList;

/**
 * This class represents the SchoolList view interface.
 */
public interface SchoolListInfoViewContract {

    interface View {

        void schoolListReady(ArrayList<SchoolListInfo> schoolListInfos);

        void schoolInfoClicked(ArrayList<SchoolSATResultInfo> schoolSATResultInfos);

        void onFailure(String message);
    }

    interface Presenter {

        void getSchoolSATResultInfo(String schoolCode);
    }
}
