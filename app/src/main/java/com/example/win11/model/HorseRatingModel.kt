package com.example.win11.model


import com.google.gson.annotations.SerializedName

data class HorseRatingModel(
    @SerializedName("horserating")
    val horserating: List<Horserating>
)