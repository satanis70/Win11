package com.example.win11.model


import com.google.gson.annotations.SerializedName

data class LeadersModel(
    @SerializedName("leadersbyyear")
    val leadersbyyear: List<Leadersbyyear>
)