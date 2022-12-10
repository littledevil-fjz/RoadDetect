package com.example.roaddectect.repository.network.responce

import com.example.roaddectect.bean.RegisterBean

class RegisterResponse(msg: String, code: String, data: RegisterBean):
    BaseResponse<RegisterBean>(msg, code, data)