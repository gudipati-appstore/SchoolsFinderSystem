package com.gcoders.schoolinfo.schoolsfindersystem.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.gcoders.schoolinfo.schoolsfindersystem.R;
import com.gcoders.schoolinfo.schoolsfindersystem.SchoolApplication;
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo;
import com.gcoders.schoolinfo.schoolsfindersystem.presenter.SplashPresenter;

import java.util.ArrayList;

public class SplashActivity extends AppCompatActivity implements SplashContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SplashContract.Presenter presenter = new SplashPresenter(this);
        if(null == SchoolApplication.getsInstance().getSchoolListInfoObjects()){
            presenter.getSchoolList();
        }else{
            setSchoolListReady(SchoolApplication.getsInstance().getSchoolListInfoObjects());
        }
    }


    @Override
    public void showHomePage() {
        Intent intent = new Intent(this, SchoolMainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onFailure(String failureMessage) {
        Toast.makeText(this, failureMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setSchoolListReady(ArrayList<SchoolListInfo> schoolListInfoObjects) {
        SchoolApplication.getsInstance().storeSchoolListObject(schoolListInfoObjects);
        showHomePage();
    }

}
