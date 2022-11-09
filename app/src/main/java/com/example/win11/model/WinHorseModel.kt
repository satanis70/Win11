package com.example.win11.model


import com.google.gson.annotations.SerializedName

data class WinHorseModel(
    @SerializedName("howtofindwinhorse")
    val howtofindwinhorse: List<Howtofindwinhorse>
)