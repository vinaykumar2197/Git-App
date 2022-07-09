package com.vinay.myapplication.domain.model

//We are fetching Title, Created date, closed date, userName, user Image for closed pull request of this repository
// as per app requirement

data class PullRequest(
    val title:String?,
    val created_at:String?,
    val closed_at:String?,
    val user: User
)
