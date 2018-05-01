package com.gcoders.schoolinfo.schoolsfindersystem.presenter;

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo;
import com.gcoders.schoolinfo.schoolsfindersystem.service.SchoolInfoSystemService;
import com.gcoders.schoolinfo.schoolsfindersystem.view.SchoolListInfoViewContract;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * This class represents the Schools List Presenter.
 */
public class SchoolListPresenter implements SchoolListInfoViewContract.Presenter{

    private SchoolListInfoViewContract.View schoolListView;
    private SchoolInfoSystemService schoolApiService;

    public SchoolListPresenter(SchoolListInfoViewContract.View view) {
        this.schoolListView = view;

        if (this.schoolApiService == null) {
            this.schoolApiService = new SchoolInfoSystemService();
        }
    }


    @Override
    public void getSchoolSATResultInfo(String schoolCode) {
        schoolApiService
                .getAPI()
                .getSchoolSATresultsbySchoolIdentifier(schoolCode)
                .enqueue(new Callback<ArrayList<SchoolSATResultInfo>>() {
                    @Override
                    public void onResponse(Call<ArrayList<SchoolSATResultInfo>> call, Response<ArrayList<SchoolSATResultInfo>> response) {

                        ArrayList<SchoolSATResultInfo> respBody;
                        if (response.body() != null && response.isSuccessful()) {
                            respBody = (response.body().size() > 0) ? response.body() : null;
                            schoolListView.schoolInfoClicked(respBody);
                        } else {
                            schoolListView.onFailure("No Results found. Please try a different search..!");
                        }

                    }

                    @Override
                    public void onFailure(Call<ArrayList<SchoolSATResultInfo>> call, Throwable t) {
                        schoolListView.onFailure("We were unable to complete your request. Please try again..!");
                    }
                });
    }
}
