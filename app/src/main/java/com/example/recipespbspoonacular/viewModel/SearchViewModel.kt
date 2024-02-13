package com.example.recipespbspoonacular.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.recipespbspoonacular.model.ResultsItem
import com.example.recipespbspoonacular.network.RecipeApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class SearchViewModel : ViewModel() {
    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    private val _response = MutableLiveData<List<ResultsItem?>?>()
    val response: LiveData<List<ResultsItem?>?>
        get() = _response

    fun search(term: String) {
        coroutineScope.launch {

            var getRecipesDeferred =
                RecipeApi.recipeApiService.searchRecipes(term)
            try {
                var result = getRecipesDeferred.await()
                Log.i("searchViewModel", "search result: " + result)
                if (result.results?.size!! > 0) {
                    _response.value = result.results
                    Log.i("searchViewModel", "search result: " + result.results)
                }
            } catch (e: Exception) {
                Log.i("searchViewModel", "search error: " + e.message)
                _response.value = ArrayList<ResultsItem?>()
            }
        }

    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                SearchViewModel()
            }
        }
    }
}