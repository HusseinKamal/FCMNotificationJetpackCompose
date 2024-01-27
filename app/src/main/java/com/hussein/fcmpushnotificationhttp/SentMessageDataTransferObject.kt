package com.hussein.fcmpushnotificationhttp

data class SentMessageDataTransferObject(
    val to : String?,
    val notification : NotificationBody
)  //DTO class
class NotificationBody(
    val title : String,
    val body : String
)