package com.hussein.fcmpushnotificationhttp

data class ChatState(
    val isEnteringToken : Boolean = false,
    val remoteToken : String = "",
    val messageText:String = ""
)
