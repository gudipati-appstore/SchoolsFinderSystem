package com.gcoders.schoolinfo.schoolsfindersystem.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * This class represents the School Info System service.
 */
public class SchoolInfoSystemService {
    private Retrofit retrofit = null;


    /**
     * This method creates a new instance of the API interface.
     *
     * @return The API interface
     */
    public SchoolInfoSystemAPI getAPI() {
        String BASE_URL = "https://data.cityofnewyork.us/";

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(SchoolInfoSystemAPI.class);
    }
}
