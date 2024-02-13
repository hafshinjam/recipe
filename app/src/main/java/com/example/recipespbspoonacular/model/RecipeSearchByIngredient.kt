package com.example.recipespbspoonacular.model

data class RecipeSearchByIngredient(
    val ingredients: String,//A comma-separated list of ingredients that the recipes should contain.
    //ex: carrots,tomatoes
    val number: Int = 10,//The maximum number of items to return (between 1 and 100).
    // Defaults to 10. ex: 10
    val limitLicense: Boolean,//Whether the recipes should have an open license that allows display
    // with proper attribution. ex: true
    val ranking: Int,//Whether to maximize used ingredients (1)
    // or minimize missing ingredients (2) first. ex: 1
    val ignorePantry: Boolean//Whether to ignore typical pantry items, such as water,
    // salt, flour, etc. ex: false
)
