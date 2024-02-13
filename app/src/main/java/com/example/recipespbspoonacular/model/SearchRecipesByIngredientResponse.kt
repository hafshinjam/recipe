package com.example.recipespbspoonacular.model

data class SearchRecipesByIngredientResponse(
    val searchRecipesByIngredient: List<SearchRecipesByIngredientItem?>? = null
)

data class UsedIngredientsItem(
    val originalName: String? = null,
    val image: String? = null,
    val amount: Any? = null,
    val unit: String? = null,
    val unitShort: String? = null,
    val original: String? = null,
    val meta: List<Any?>? = null,
    val name: String? = null,
    val unitLong: String? = null,
    val id: Int? = null,
    val aisle: String? = null,
    val extendedName: String? = null
)

data class MissedIngredientsItem(
    val originalName: String? = null,
    val image: String? = null,
    val amount: Any? = null,
    val unit: String? = null,
    val unitShort: String? = null,
    val original: String? = null,
    val meta: List<Any?>? = null,
    val name: String? = null,
    val unitLong: String? = null,
    val id: Int? = null,
    val aisle: String? = null,
    val extendedName: String? = null
)

data class SearchRecipesByIngredientItem(
    val image: String? = null,
    val id: Int? = null,
    val title: String? = null,
    val imageType: String? = null,
    val usedIngredients: List<UsedIngredientsItem?>? = null,
    val missedIngredients: List<MissedIngredientsItem?>? = null,
    val missedIngredientCount: Int? = null,
    val unusedIngredients: List<Any?>? = null,
    val usedIngredientCount: Int? = null,
    val likes: Int? = null
) : Recipe(image,id,title ,imageType
)

