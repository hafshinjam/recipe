package com.example.recipespbspoonacular.model

data class RecipeSearchObject(
    val query: String, //burger
    val cuisine: String, // The cuisine(s) of the recipes. One or more, comma separated
    // (will be interpreted as 'OR'). See a full list of supported cuisines. ex italian
    val excludeCuisine: String, // The cuisine(s) the recipes must not match. One or more,
    // comma separated (will be interpreted as 'AND'). See a full list of supported cuisines. ex greek
    val diet: String,//A comma-separated list of intolerances. All recipes returned must not contain
    // ingredients that are not suitable for people with the intolerances entered.
    // See a full list of supported intolerances. ex vegetarian
    val intolerances: String, //A comma-separated list of intolerances. All recipes returned must
    // not contain ingredients that are not suitable for people with the intolerances entered.
    // See a full list of supported intolerances. ex gluten
    val equipmen0t: String, //The equipment required. Multiple values will be interpreted as 'or'.
    // For example, value could be "blender, frying pan, bowl". ex pan
    val includeIngredients: String, // A comma-separated list of ingredients that should/must be
    // used in the recipes.ex tomato, cheese
    val excludeIngredients: String,//A comma-separated list of ingredients or ingredient types that
    // the recipes must not contain. ex eggs
    val type: String, //The type of recipe. See a full list of supported meal types.ex main course
    val instructionsRequired: Boolean, //Whether the recipes must have instructions.ex true
    val fillIngredients: Boolean, //Add information about the ingredients and whether they are used
    // or missing in relation to the query.ex false
    val addRecipeInformation: Boolean, //If set to true, you get more information about the recipes
    // returned.ex false
    val addRecipeNutrition: Boolean, //If set to true, you get nutritional information about each
    // recipes returned. ex false
    val author: String,//The username of the recipe author. ex coffeebean
    val tags: String, // The tags (can be diets, meal types, cuisines, or intolerances) that the
    // recipe must have. ex ipsum ea proident amet occaecat
    val recipeBoxId: Int,//The id of the recipe box to which the search should be limited to.ex 2468
    val titleMatch: String, //Enter text that must be found in the title of the recipes. ex Crock Pot
    val maxReadyTime: Int,//The maximum time in minutes it should take to prepare and cook the
    // recipe. ex20
    val ignorePantry: Boolean,//Whether to ignore typical pantry items, such as water, salt,
    // flour, etc. ex false
    val sort: String, //The strategy to sort recipes by. See a full list of supported sorting
    // options. calories
    val sortDirection: String,//The direction in which to sort. Must be either 'asc' (ascending)
    // or 'desc' (descending).
    val minCarbs: Int,//The minimum amount of carbohydrates in grams the recipe must have. ex 10
    val maxCarbs: Int, //The maximum amount of carbohydrates in grams the recipe can have. ex 100
    val minProtein: Int,//The minimum amount of Protein in grams the recipe must have. ex 10
    val maxProtein: Int,//The maximum amount of Protein in grams the recipe must have. ex 100
    val minCalories: Int,//The minimum amount of Calories in grams the recipe must have. ex 50
    val maxCalories: Int,//The maximum amount of Calories in grams the recipe must have. ex 800
    val minFat: Int,//The minimum amount of Fat in grams the recipe must have. ex 1
    val maxFat: Int,//The maximum amount of Fat in grams the recipe must have. ex 100
    val minAlcohol: Int,//The minimum amount of Alcohol in grams the recipe must have. ex 0
    val maxAlcohol: Int,//The maximum amount of Alcohol in grams the recipe must have. ex  100
    val minCaffeine: Int,//The minimum amount of caffeine in grams the recipe must have. ex 0
    val maxCaffeine: Int,//The maximum amount of caffeine in grams the recipe must have. ex  100
    val minCopper: Int,//The minimum amount of Copper in grams the recipe must have. ex 0
    val maxCopper: Int,//The maximum amount of Copper in grams the recipe must have. ex  100
    val minCalcium: Int,//The minimum amount of Calcium in grams the recipe must have. ex 0
    val maxCalcium: Int,//The maximum amount of Calcium in grams the recipe must have. ex 100
    val minCholine: Int,//The minimum amount of Choline in grams the recipe must have. ex 0
    val maxCholine: Int,//The maximum amount of Choline in grams the recipe must have. ex  100
    val minCholesterol: Int,//The minimum amount of Cholesterol in grams the recipe must have. ex 0
    val maxCholesterol: Int,//The minimum amount of Cholesterol in grams the recipe must have. ex  100
    val minFluoride: Int,//The minimum amount of Fluoride in grams the recipe must have. ex 0
    val maxFluoride: Int,//The maximum amount of Fluoride in grams the recipe must have. ex 100
    val minSaturatedFat: Int,//The minimum amount of SaturatedFat in grams the recipe must have. ex 0
    val maxSaturatedFat: Int,//The maximum amount of SaturatedFat in grams the recipe must have. ex 100
    val minVitaminA: Int,//The minimum amount of VitaminA in grams the recipe must have. ex 0
    val maxVitaminA: Int,//The maximum amount of VitaminA in grams the recipe must have. ex 100
    val minVitaminC: Int,//The minimum amount of VitaminC in grams the recipe must have. ex 0
    val maxVitaminC: Int,//The maximum amount of VitaminC in grams the recipe must have. ex 100
    val minVitaminD: Int,//The minimum amount of VitaminD in grams the recipe must have. ex 0
    val maxVitaminD: Int,//The maximum amount of VitaminD in grams the recipe must have. ex  100
    val minVitaminE: Int,//The minimum amount of VitaminE in grams the recipe must have. ex 0
    val maxVitaminE: Int,//The maximum amount of VitaminE in grams the recipe must have. ex  100
    val minVitaminK: Int,//The minimum amount of VitaminK in grams the recipe must have. ex 0
    val maxVitaminK: Int,//The maximum amount of VitaminK in grams the recipe must have. ex 100
    val minVitaminB1: Int,//The minimum amount of VitaminB1 in grams the recipe must have. ex 0
    val maxVitaminB1: Int,//The maximum amount of VitaminB1 in grams the recipe must have. ex  100
    val minVitaminB2: Int, //The minimum amount of VitaminB2 in grams the recipe must have. ex 0
    val maxVitaminB2: Int,//The maximum amount of VitaminB2 in grams the recipe must have. ex  100
    val minVitaminB5: Int, //The minimum amount of VitaminB5 in grams the recipe must have. ex 0
    val maxVitaminB5: Int,//The maximum amount of VitaminB5 in grams the recipe must have. ex  100
    val minVitaminB3: Int, //The minimum amount of VitaminB3 in grams the recipe must have. ex 0
    val maxVitaminB3: Int,//The minimum amount of VitaminB3 in grams the recipe must have. ex  100
    val minVitaminB6: Int,//The minimum amount of VitaminB6 in grams the recipe must have. ex 0
    val maxVitaminB6: Int,//The maximum amount of VitaminB6 in grams the recipe must have. ex 100
    val minVitaminB12: Int,//The minimum amount of VitaminB12 in grams the recipe must have. ex 0
    val maxVitaminB12: Int,//The maximum amount of VitaminB12 in grams the recipe must have. ex  100
    val minFiber: Int, //The minimum amount of fiber in grams the recipe must have. ex 0
    val maxFiber: Int,//The maximum amount of fiber in grams the recipe must have. ex 100
    val minFolate: Int, //The minimum amount of folate in grams the recipe must have. ex 0
    val maxFolate: Int,//The maximum amount of folate in grams the recipe must have. ex  100
    val minFolicAcid: Int, //The minimum amount of folic acid in grams the recipe must have. ex 0
    val maxFolicAcid: Int,//The maximum amount of folic acid in grams the recipe must have. ex  100
    val minIodine: Int,//The minimum amount of iodine in grams the recipe must have. ex 0
    val maxIodine: Int,//The maximum amount of iodine in grams the recipe must have. ex  100
    val minIron: Int,//The minimum amount of iron in grams the recipe must have. ex 0
    val maxIron: Int,//The maximum amount of iron in grams the recipe must have. ex  100
    val minMagnesium: Int,//The minimum amount of magnesium in grams the recipe must have. ex 0
    val maxMagnesium: Int,//The maximum amount of magnesium in grams the recipe must have. ex  100
    val minManganese: Int, //The minimum amount of manganese in grams the recipe must have. ex 0
    val maxManganese: Int,//The maximum amount of manganese in grams the recipe must have. ex 100
    val minPhosphorus: Int, //The minimum amount of Phosphorus in grams the recipe must have. ex 0
    val maxPhosphorus: Int,//The maximum amount of Phosphorus in grams the recipe must have. ex  100
    val minPotassium: Int, //The minimum amount of Potassium in grams the recipe must have. ex 0
    val maxPotassium: Int,//The maximum amount of Potassium in grams the recipe must have. ex  100
    val minSelenium: Int,//The minimum amount of Selenium in grams the recipe must have. ex 0
    val maxSelenium: Int,//The maximum amount of Selenium in grams the recipe must have. ex  100
    val minSodium: Int, //The minimum amount of Sodium in grams the recipe must have. ex 0
    val maxSodium: Int,//The maximum amount of Sodium in grams the recipe must have. ex  100
    val minSugar: Int, //The minimum amount of Sugar in grams the recipe must have. ex 0
    val maxSugar: Int,//The maximum amount of Sugar in grams the recipe must have. ex  100
    val minZinc: Int, //The minimum amount of Zinc in grams the recipe must have. ex 0
    val maxZinc: Int,//The maximum amount of Zinc in grams the recipe must have. ex  100
    val offset: Int,//The number of results to skip (between 0 and 900). 606
    val number: Int,//The maximum number of items to return (between 1 and 100). Defaults to 10. ex 10
    val limitLicense: Boolean //Whether the recipes should have an open license that allows display
    // with proper attribution.ex true
)
