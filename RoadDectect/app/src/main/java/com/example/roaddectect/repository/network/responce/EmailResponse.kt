package com.example.roaddectect.repository.network.responce

import com.example.roaddectect.bean.EmailBean

class EmailResponse(msg: String, code: String, data: EmailBean):
    BaseResponse<EmailBean>(msg, code, data)