package com.vinay.myapplication.presentation.pull_request_listings

import com.vinay.myapplication.domain.model.PullRequest

data class PLState(
    val companies: List<PullRequest> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
)
