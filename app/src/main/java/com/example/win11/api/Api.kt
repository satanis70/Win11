package com.example.win11.api


import com.example.win11.model.HorseRatingModel
import com.example.win11.model.LeadersModel
import com.example.win11.model.WinHorseModel
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("thoroughbred.json")
    fun getLeaders(): Call<LeadersModel>
    @GET("howtofindwinhorse.json")
    fun getWinHorse(): Call<WinHorseModel>
    @GET("horserating.json")
    fun getHorseRating(): Call<HorseRatingModel>
}