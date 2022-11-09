package com.example.win11.model


import com.google.gson.annotations.SerializedName

data class Leadersbyyear(
    @SerializedName("name")
    val name: String,
    @SerializedName("starts")
    val starts: String,
    @SerializedName("total")
    val total: String,
    @SerializedName("win")
    val win: String
)