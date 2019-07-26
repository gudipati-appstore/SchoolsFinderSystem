package com.gcoders.schoolinfo.schoolsfindersystem.presenter

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo
import com.gcoders.schoolinfo.schoolsfindersystem.service.SchoolInfoSystemService
import com.gcoders.schoolinfo.schoolsfindersystem.view.SchoolListInfoViewContract

import java.util.ArrayList

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * This class represents the Schools List Presenter.
 */
class SchoolListPresenter(private val schoolListView: SchoolListInfoViewContract.View) : SchoolListInfoViewContract.Presenter {
    private var schoolApiService: SchoolInfoSystemService? = null

    init {

        if (this.schoolApiService == null) {
            this.schoolApiService = SchoolInfoSystemService()
        }
    }


    override fun getSchoolSATResultInfo(schoolCode: String) {
        schoolApiService!!
                .api
                .getSchoolSATresultsbySchoolIdentifier(schoolCode)
                .enqueue(object : Callback<ArrayList<SchoolSATResultInfo>> {
                    override fun onResponse(call: Call<ArrayList<SchoolSATResultInfo>>, response: Response<ArrayList<SchoolSATResultInfo>>) {

                        val respBody: ArrayList<SchoolSATResultInfo>?
                        if (response.body() != null && response.isSuccessful) {
                            respBody = if (response.body()!!.size > 0) response.body() else null
                            schoolListView.schoolInfoClicked(respBody!!)
                        } else {
                            schoolListView.onFailure("No Results found. Please try a different search..!")
                        }

                    }

                    override fun onFailure(call: Call<ArrayList<SchoolSATResultInfo>>, t: Throwable) {
                        schoolListView.onFailure("We were unable to complete your request. Please try again..!")
                    }
                })
    }
}
