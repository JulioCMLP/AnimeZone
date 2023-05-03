package com.julio.animezone

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface MyAnimeListService {
    @GET("anime")
    suspend fun getAnimeList(): Response<Anime>

    companion object {
        fun create(): MyAnimeListService {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.myanimelist.net/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(MyAnimeListService::class.java)
        }
    }
}

object MyAnimeListApi {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://myanimelist.net/v1/oauth2/authorize")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: MyAnimeListService = retrofit.create(MyAnimeListService::class.java)
}