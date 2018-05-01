package com.gcoders.schoolinfo.schoolsfindersystem;

import android.app.Application;
import android.content.Intent;

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo;
import com.gcoders.schoolinfo.schoolsfindersystem.view.SplashActivity;

import java.util.ArrayList;

public class SchoolApplication extends Application{

    private static SchoolApplication sInstance;
    private ArrayList<SchoolListInfo> schoolListInfoObjects;

    @Override
    public void onCreate() {
        super.onCreate();
        initAppInstance();
    }

    private void initAppInstance(){
        if ( sInstance == null) {
            sInstance = this;
        }
    }

    public static SchoolApplication getsInstance(){
        return sInstance;
    }

    public void storeSchoolListObject(ArrayList<SchoolListInfo> schoolListInfoObjects){
        this.schoolListInfoObjects = schoolListInfoObjects;
    }

    public ArrayList<SchoolListInfo> getSchoolListInfoObjects(){
        return this.schoolListInfoObjects;
    }

    public void clearSchoolObjects(){
        this.schoolListInfoObjects.clear();
    }
}
