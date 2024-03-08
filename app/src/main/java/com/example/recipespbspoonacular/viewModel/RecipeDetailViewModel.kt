package com.example.recipespbspoonacular.viewModel

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.navigation.findNavController
import com.example.recipespbspoonacular.SearchFragmentDirections
import com.example.recipespbspoonacular.model.GetRecipeResponse
import com.example.recipespbspoonacular.network.RecipeApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.io.Serializable

class RecipeDetailViewModel : ViewModel() {
    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)
    private val _recipeResponse = MutableLiveData<GetRecipeResponse?>()
    val recipeResponse: LiveData<GetRecipeResponse?>
        get() = _recipeResponse

    fun getRecipe(id: Int?, nutritionIncluded: Boolean, view: View) {
        Log.i("getRecipe", "getRecipe: id and boolean " + id + nutritionIncluded)

        if (id != null) {
            coroutineScope.launch {
                Log.i("getRecipe", "getRecipe: before getRecipeCalled")
                val getRecipeDiffered =
                    RecipeApi.recipeApiService.getRecipe(id.toString(), nutritionIncluded)
                Log.i("getRecipe", "getRecipe: after getRecipeCalled")
                try {
                    Log.i("getRecipe", "getRecipe: before request")
                    val result = getRecipeDiffered.await()
                    Log.i("getRecipe", "getRecipe: recipe Received " + result.toString())
                    if (result.id == id) {
                        val serializable: Serializable = result
//                        view.findNavController().navigate(R.id.action_searchFragment_to_recipeDetailFragment)
                        val action =
                            SearchFragmentDirections.actionSearchFragmentToRecipeDetailFragment(result)
                        view.findNavController().navigate(action)
                    }
                } catch (e: Exception) {
                    Log.i("getRecipe", "getRecipe: recipe not Received" + e.message)
                }
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                RecipeDetailViewModel()
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}