package com.gcoders.schoolinfo.schoolsfindersystem.view;

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo;
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo;

import java.util.List;

/**
 * This class represents the SchoolList view interface.
 */
public interface SchoolListInfoViewContract {

    void schoolListReady(List<SchoolListInfo> schoolListInfos);
    void schoolInfoClicked(List<SchoolSATResultInfo> schoolSATResultInfos);
    void onFailure(String message);
}
