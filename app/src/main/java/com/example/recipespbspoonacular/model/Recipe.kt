package com.example.recipespbspoonacular.model

open class Recipe constructor(
    var imageAddress: String? = null,
    var idNumber: Int? = null,
    var titleName: String? = null,
    val imageFileType: String? = null
) {
}