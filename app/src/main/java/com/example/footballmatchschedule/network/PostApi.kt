package com.example.footballmatchschedule.network

import android.database.Observable
import com.example.footballmatchschedule.League
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PostApi {

    @GET("/api/v1/json/1/lookupleague.php")
    fun getLeague(@Query("id") id: String): Observable<League>
}