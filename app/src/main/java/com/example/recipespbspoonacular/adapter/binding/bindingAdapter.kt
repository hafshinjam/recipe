package com.example.recipespbspoonacular.adapter.binding

import android.util.Log
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recipespbspoonacular.R
import com.example.recipespbspoonacular.adapter.recyclerView.RecipeSearchRecyclerAdapter
import com.example.recipespbspoonacular.model.Recipe
import com.squareup.picasso.Picasso

@BindingAdapter("imageUrl")
fun bindImage(imageView: ImageView, imageUrl: String?) {
    imageUrl?.let {

        val imageUri = imageUrl.toUri()
//        Glide.with(imageView.context).load(imageUri).placeholder(R.mipmap.ic_recipe).into(imageView)
        Picasso.get().load(imageUri).placeholder(R.mipmap.ic_recipe).into(imageView)
    }
}
@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, datas :List<Recipe>?){
    val adapter = recyclerView.adapter as RecipeSearchRecyclerAdapter
    adapter.submitList(datas)

}
