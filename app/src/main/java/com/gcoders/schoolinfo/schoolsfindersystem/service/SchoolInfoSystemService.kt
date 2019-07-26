package com.gcoders.schoolinfo.schoolsfindersystem.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * This class represents the School Info System service.
 */
class SchoolInfoSystemService {
    private var retrofit: Retrofit? = null


    /**
     * This method creates a new instance of the API interface.
     *
     * @return The API interface
     */
    val api: SchoolInfoSystemAPI
        get() {
            val BASE_URL = "https://data.cityofnewyork.us/"

            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }

            return retrofit!!.create(SchoolInfoSystemAPI::class.java!!)
        }
}
