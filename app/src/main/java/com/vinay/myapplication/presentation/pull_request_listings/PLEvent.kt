package com.vinay.myapplication.presentation.pull_request_listings

sealed class PLEvent {
    object Refresh: PLEvent()
}
