package com.example.roaddectect.repository.db

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class ImageDataBase(var imageName:String, var label:String,var confidence:Float,
                         var left:Float,var top:Float,var right:Float,var bottom:Float)

{
    @PrimaryKey(autoGenerate = true)var id=0L       //L代表是Long类型
}
