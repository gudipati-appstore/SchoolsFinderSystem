package com.gcoders.schoolinfo.schoolsfindersystem.service;

import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo;
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * This class represents the NYC School System API, all endpoints are defined here.
 */
public interface SchoolInfoSystemAPI {

    @GET("resource/97mf-9njv.json")
    Call<List<SchoolListInfo>> getSchoolList();

    @GET("resource/734v-jeq5.json")
    Call<List<SchoolSATResultInfo>> getSchoolSATresultsbySchoolIdentifier(@Query("dbn") String dbn);
}
