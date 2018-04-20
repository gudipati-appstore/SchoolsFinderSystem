package com.gcoders.schoolinfo.schoolsfindersystem.presenter;

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo;
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo;
import com.gcoders.schoolinfo.schoolsfindersystem.service.SchoolInfoSystemService;
import com.gcoders.schoolinfo.schoolsfindersystem.view.SchoolListInfoView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * This class represents the Schools List Presenter.
 */
public class SchoolListPresenter {

    private SchoolListInfoView schoolListView;
    private SchoolInfoSystemService schoolApiService;

    public SchoolListPresenter(SchoolListInfoView view) {
        this.schoolListView = view;

        if (this.schoolApiService == null) {
            this.schoolApiService = new SchoolInfoSystemService();
        }
    }

    public void getSchoolList() {
        schoolApiService
                .getAPI()
                .getSchoolList()
                .enqueue(new Callback<List<SchoolListInfo>>() {
                    @Override
                    public void onResponse(Call<List<SchoolListInfo>> call, Response<List<SchoolListInfo>> response) {

                        List<SchoolListInfo> respBody;
                        if (response.body() != null) {
                            respBody = response.body();
                            schoolListView.schoolListReady(respBody);
                        } else {
                            schoolListView.onFailure("No Results found. Please try a different search..!");
                        }

                    }

                    @Override
                    public void onFailure(Call<List<SchoolListInfo>> call, Throwable t) {
                        schoolListView.onFailure("We were unable to complete your request. Please try again..!");
                    }
                });
    }

    public void getSchoolSATResultInfo(String dbn) {
        schoolApiService
                .getAPI()
                .getSchoolSATresultsbySchoolIdentifier(dbn)
                .enqueue(new Callback<List<SchoolSATResultInfo>>() {
                    @Override
                    public void onResponse(Call<List<SchoolSATResultInfo>> call, Response<List<SchoolSATResultInfo>> response) {

                        List<SchoolSATResultInfo> respBody;
                        if (response.body() != null) {
                            respBody = (response.body().size() > 0) ? response.body(): null;
                            schoolListView.schoolInfoClicked(respBody);
                        } else {
                            schoolListView.onFailure("No Results found. Please try a different search..!");
                        }

                    }

                    @Override
                    public void onFailure(Call<List<SchoolSATResultInfo>> call, Throwable t) {
                        schoolListView.onFailure("We were unable to complete your request. Please try again..!");
                    }
                });
    }
}
