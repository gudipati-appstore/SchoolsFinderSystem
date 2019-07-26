package com.gcoders.schoolinfo.schoolsfindersystem.service

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo

import java.util.ArrayList

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * This class represents the NYC School System API, all endpoints are defined here.
 */
interface SchoolInfoSystemAPI {

    @get:GET("resource/97mf-9njv.json")
    val schoolList: Call<ArrayList<SchoolListInfo>>

    @GET("resource/734v-jeq5.json")
    fun getSchoolSATresultsbySchoolIdentifier(@Query("dbn") schoolCode: String): Call<ArrayList<SchoolSATResultInfo>>
}
