package com.example.recipespbspoonacular.network

import com.example.recipespbspoonacular.model.GetRecipeResponse
import com.example.recipespbspoonacular.model.SearchRecipes
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

private const val BASE_URL = "https://api.spoonacular.com"
private const val API_KEY_TAG = "apiKey"
private const val API_KEY = "217e8efd86d248d89cb8371553f76dc4"


private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .baseUrl(BASE_URL)
    .client(OkHttpClient.Builder().addInterceptor { chain ->
        val url = chain.request().url()
            .newBuilder().addQueryParameter(API_KEY_TAG, API_KEY).build()
        chain.proceed(chain.request().newBuilder().url(url).build())
    }.build())
    .build()

interface RecipeApiService {
    @GET("recipes/complexSearch")
    fun searchRecipes(@Query("query") searchTerm: String): Deferred<SearchRecipes>

    @GET("recipes/{id}/information")
    fun getRecipe(
        @Path("id") recipeId: String,
        @Query("includeNutrition") includeNutrition: Boolean
    ): Deferred<GetRecipeResponse>

}

object RecipeApi {
    val recipeApiService: RecipeApiService by lazy {
        retrofit.create(RecipeApiService::class.java)
    }
}