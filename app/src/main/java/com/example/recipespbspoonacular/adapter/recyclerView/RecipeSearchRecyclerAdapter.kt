package com.example.recipespbspoonacular.adapter.recyclerView

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recipespbspoonacular.databinding.RecipeSearchItemBinding
import com.example.recipespbspoonacular.model.Recipe
import com.example.recipespbspoonacular.model.ResultsItem
import com.example.recipespbspoonacular.model.SearchRecipesByIngredientItem
import com.example.recipespbspoonacular.viewModel.RecipeDetailViewModel

class RecipeSearchRecyclerAdapter(val viewModel: RecipeDetailViewModel) :
    androidx.recyclerview.widget.ListAdapter<Recipe,
            RecipeSearchRecyclerAdapter.ViewHolder>(RecipeSearchDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(RecipeSearchItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindViews(getItem(position), viewModel)
    }

    class ViewHolder private constructor(private var binding: RecipeSearchItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindViews(recipe: Recipe, viewModel: RecipeDetailViewModel) {
            if (recipe is ResultsItem) {
                recipe.titleName = recipe.title
                recipe.imageAddress = recipe.image
                recipe.idNumber = recipe.id
            } else {
                recipe.titleName = (recipe as SearchRecipesByIngredientItem).title
                recipe.imageAddress = recipe.image
                recipe.idNumber = recipe.id
            }
            Log.i("bindViews", "bindViews: recipe" + recipe)
            binding.root.setOnClickListener {
                viewModel.getRecipe(recipe.idNumber, true)
            }
            binding.recipe = recipe
            binding.executePendingBindings()
            binding.recipeItemIv.setOnClickListener {
                Toast.makeText(binding.root.context, recipe.titleName, LENGTH_LONG).show()
            }
        }

        companion object {
            fun from(parent: RecipeSearchItemBinding): ViewHolder {

                return ViewHolder(parent)
            }
        }
    }


    companion object {
        class RecipeSearchDiffCallback : DiffUtil.ItemCallback<Recipe>() {
            override fun areItemsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
                return oldItem === newItem

            }

            override fun areContentsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
                return oldItem.idNumber == newItem.idNumber
            }
        }
    }
}