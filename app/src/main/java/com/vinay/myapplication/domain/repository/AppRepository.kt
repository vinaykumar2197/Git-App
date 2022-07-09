package com.vinay.myapplication.domain.repository

import com.vinay.myapplication.util.Resource
import com.vinay.myapplication.domain.model.PullRequest
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean
    ): Flow<Resource<List<PullRequest>>>
}