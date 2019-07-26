package com.gcoders.schoolinfo.schoolsfindersystem.presenter

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo
import com.gcoders.schoolinfo.schoolsfindersystem.service.SchoolInfoSystemService
import com.gcoders.schoolinfo.schoolsfindersystem.view.SplashContract

import java.util.ArrayList

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * This class represents the Schools List Presenter.
 */
class SplashPresenter(private val splashView: SplashContract.View) : SplashContract.Presenter {
    private var schoolApiService: SchoolInfoSystemService? = null

    init {

        if (this.schoolApiService == null) {
            this.schoolApiService = SchoolInfoSystemService()
        }
    }

    override fun getSchoolList() {
        schoolApiService!!
                .api
                .schoolList
                .enqueue(object : Callback<ArrayList<SchoolListInfo>> {
                    override fun onResponse(call: Call<ArrayList<SchoolListInfo>>, response: Response<ArrayList<SchoolListInfo>>) {

                        val respBody: ArrayList<SchoolListInfo>?
                        if (response.body() != null && response.isSuccessful) {
                            respBody = response.body()
                            if (respBody != null) {
                                splashView.setSchoolListReady(respBody)
                            }
                        } else {
                            splashView.onFailure("No Results found. Please try a different search..!")
                        }
                    }

                    override fun onFailure(call: Call<ArrayList<SchoolListInfo>>, t: Throwable) {
                        splashView.onFailure("We were unable to complete your request. Please try again..!")
                    }
                })
    }

}
