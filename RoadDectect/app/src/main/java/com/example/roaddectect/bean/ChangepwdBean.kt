package com.example.roaddectect.bean

import com.google.gson.annotations.SerializedName

class ChangepwdBean(@SerializedName("RequestName") val RequestName: String,
    @SerializedName("res") val res: String)