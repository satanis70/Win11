package com.example.win11.model


import com.google.gson.annotations.SerializedName

data class Horserating(
    @SerializedName("earnings")
    val earnings: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("starts")
    val starts: String,
    @SerializedName("win")
    val win: String
)