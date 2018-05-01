package com.gcoders.schoolinfo.schoolsfindersystem.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class SchoolSATResultInfo implements Parcelable {

    @SerializedName("dbn")
    @Expose
    private String dbn;
    @SerializedName("num_of_sat_test_takers")
    @Expose
    private String numOfSatTestTakers;
    @SerializedName("sat_critical_reading_avg_score")
    @Expose
    private String satCriticalReadingAvgScore;
    @SerializedName("sat_math_avg_score")
    @Expose
    private String satMathAvgScore;
    @SerializedName("sat_writing_avg_score")
    @Expose
    private String satWritingAvgScore;
    @SerializedName("school_name")
    @Expose
    private String schoolName;

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public String getNumOfSatTestTakers() {
        return numOfSatTestTakers;
    }

    public void setNumOfSatTestTakers(String numOfSatTestTakers) {
        this.numOfSatTestTakers = numOfSatTestTakers;
    }

    public String getSatCriticalReadingAvgScore() {
        return satCriticalReadingAvgScore;
    }

    public void setSatCriticalReadingAvgScore(String satCriticalReadingAvgScore) {
        this.satCriticalReadingAvgScore = satCriticalReadingAvgScore;
    }

    public String getSatMathAvgScore() {
        return satMathAvgScore;
    }

    public void setSatMathAvgScore(String satMathAvgScore) {
        this.satMathAvgScore = satMathAvgScore;
    }

    public String getSatWritingAvgScore() {
        return satWritingAvgScore;
    }

    public void setSatWritingAvgScore(String satWritingAvgScore) {
        this.satWritingAvgScore = satWritingAvgScore;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    protected SchoolSATResultInfo(Parcel in) {
        dbn = in.readString();
        numOfSatTestTakers = in.readString();
        satCriticalReadingAvgScore = in.readString();
        satMathAvgScore = in.readString();
        satWritingAvgScore = in.readString();
        schoolName = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(dbn);
        dest.writeString(numOfSatTestTakers);
        dest.writeString(satCriticalReadingAvgScore);
        dest.writeString(satMathAvgScore);
        dest.writeString(satWritingAvgScore);
        dest.writeString(schoolName);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<SchoolSATResultInfo> CREATOR = new Parcelable.Creator<SchoolSATResultInfo>() {
        @Override
        public SchoolSATResultInfo createFromParcel(Parcel in) {
            return new SchoolSATResultInfo(in);
        }

        @Override
        public SchoolSATResultInfo[] newArray(int size) {
            return new SchoolSATResultInfo[size];
        }
    };
}