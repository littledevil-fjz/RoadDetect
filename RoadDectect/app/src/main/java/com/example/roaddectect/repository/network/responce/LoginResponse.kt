package com.example.roaddectect.repository.network.responce

import com.example.roaddectect.bean.LoginBean

class LoginResponse(msg: String, code: String, data: LoginBean):
    BaseResponse<LoginBean>(msg, code, data)