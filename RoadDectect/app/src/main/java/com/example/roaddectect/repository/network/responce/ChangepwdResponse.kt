package com.example.roaddectect.repository.network.responce

import com.example.roaddectect.bean.ChangepwdBean

class ChangepwdResponse(msg: String, code: String, data: ChangepwdBean):
    BaseResponse<ChangepwdBean>(msg, code, data)