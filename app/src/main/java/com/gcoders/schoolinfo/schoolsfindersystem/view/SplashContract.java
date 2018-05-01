package com.gcoders.schoolinfo.schoolsfindersystem.view;

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo;
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the SchoolList view interface.
 */
public interface SplashContract {

    interface View {

        void showHomePage();
        void onFailure(String failureMessage);
        void setSchoolListReady(ArrayList<SchoolListInfo> schoolListInfoObjects);

    }

    interface Presenter {

        void getSchoolList();


    }
}
