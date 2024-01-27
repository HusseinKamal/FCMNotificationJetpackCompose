package com.hussein.fcmpushnotificationhttp

import retrofit2.http.Body
import retrofit2.http.POST

interface FcmApi {

    @POST("/send")
    suspend fun sendMessage(
        @Body body: SentMessageDataTransferObject
    )

    @POST("/broadcast")
    suspend fun broadcast(
        @Body body: SentMessageDataTransferObject
    )
}