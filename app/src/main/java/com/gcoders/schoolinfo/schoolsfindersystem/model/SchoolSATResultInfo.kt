package com.gcoders.schoolinfo.schoolsfindersystem.model

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class SchoolSATResultInfo constructor(parcel: Parcel) : Parcelable {

    @SerializedName("dbn")
    @Expose
    var dbn: String? = null
    @SerializedName("num_of_sat_test_takers")
    @Expose
    var numOfSatTestTakers: String? = null
    @SerializedName("sat_critical_reading_avg_score")
    @Expose
    var satCriticalReadingAvgScore: String? = null
    @SerializedName("sat_math_avg_score")
    @Expose
    var satMathAvgScore: String? = null
    @SerializedName("sat_writing_avg_score")
    @Expose
    var satWritingAvgScore: String? = null
    @SerializedName("school_name")
    @Expose
    var schoolName: String? = null


    init {
        dbn = parcel.readString()
        numOfSatTestTakers = parcel.readString()
        satCriticalReadingAvgScore = parcel.readString()
        satMathAvgScore = parcel.readString()
        satWritingAvgScore = parcel.readString()
        schoolName = parcel.readString()
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(dbn)
        dest.writeString(numOfSatTestTakers)
        dest.writeString(satCriticalReadingAvgScore)
        dest.writeString(satMathAvgScore)
        dest.writeString(satWritingAvgScore)
        dest.writeString(schoolName)
    }

    companion object {

        @JvmField val CREATOR: Parcelable.Creator<SchoolSATResultInfo> = object : Parcelable.Creator<SchoolSATResultInfo> {
            override fun createFromParcel(parcel: Parcel): SchoolSATResultInfo {
                return SchoolSATResultInfo(parcel)
            }

            override fun newArray(size: Int): Array<SchoolSATResultInfo?> {
                return arrayOfNulls(size)
            }
        }
    }
}