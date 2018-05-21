package com.gcoders.schoolinfo.schoolsfindersystem.presenter;

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo;
import com.gcoders.schoolinfo.schoolsfindersystem.service.SchoolInfoSystemService;
import com.gcoders.schoolinfo.schoolsfindersystem.view.SplashContract;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * This class represents the Schools List Presenter.
 */
public class SplashPresenter implements SplashContract.Presenter{

    private SplashContract.View splashView;
    private SchoolInfoSystemService schoolApiService;

    public SplashPresenter(SplashContract.View splashView) {
        this.splashView = splashView;

        if (this.schoolApiService == null) {
            this.schoolApiService = new SchoolInfoSystemService();
        }
    }

    @Override
    public void getSchoolList() {
        schoolApiService
                .getAPI()
                .getSchoolList()
                .enqueue(new Callback<ArrayList<SchoolListInfo>>() {
                    @Override
                    public void onResponse(Call<ArrayList<SchoolListInfo>> call, Response<ArrayList<SchoolListInfo>> response) {

                        ArrayList<SchoolListInfo> respBody;
                        if (response.body() != null && response.isSuccessful()) {
                            respBody = response.body();
                            splashView.setSchoolListReady(respBody);
                        } else {
                            splashView.onFailure("No Results found. Please try a different search..!");
                        }
                    }

                    @Override
                    public void onFailure(Call<ArrayList<SchoolListInfo>> call, Throwable t) {
                        splashView.onFailure("We were unable to complete your request. Please try again..!");
                    }
                });
    }

}
