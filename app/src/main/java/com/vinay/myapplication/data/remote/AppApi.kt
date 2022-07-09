package com.vinay.myapplication.data.remote

import com.vinay.myapplication.domain.model.PullRequest
import retrofit2.http.GET

interface AppApi {

    @GET("repos/bumptech/glide/pulls?state=closed")
    suspend fun getListings(): List<PullRequest>

    companion object {
        const val BASE_URL = "https://api.github.com/"
    }
}