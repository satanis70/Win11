package com.example.win11.model


import com.google.gson.annotations.SerializedName

data class Howtofindwinhorse(
    @SerializedName("advice")
    val advice: String,
    @SerializedName("name")
    val name: String
)