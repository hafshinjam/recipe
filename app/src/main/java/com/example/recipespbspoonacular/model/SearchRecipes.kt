package com.example.recipespbspoonacular.model

data class SearchRecipes(
    val number: Int? = null,
    val totalResults: Int? = null,
    val offset: Int? = null,
    val results: List<ResultsItem?>? = null
)

data class ResultsItem(
     var image: String? = null,
     var id: Int? = null,
     var title: String? = null,
     var imageType: String? = null
) : Recipe(image,id,title ,imageType)

