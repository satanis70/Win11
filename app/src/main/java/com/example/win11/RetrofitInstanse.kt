package com.example.win11

import com.example.win11.api.Api
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    fun instance(): Api {
        val apiInterface = Retrofit.Builder()
            .baseUrl("http://49.12.202.175/win11/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)
        return apiInterface
    }
}