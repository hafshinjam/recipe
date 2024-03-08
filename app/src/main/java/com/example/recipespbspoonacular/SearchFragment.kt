package com.example.recipespbspoonacular

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.recipespbspoonacular.adapter.recyclerView.RecipeSearchRecyclerAdapter
import com.example.recipespbspoonacular.databinding.FragmentSearchBinding
import com.example.recipespbspoonacular.viewModel.RecipeDetailViewModel
import com.example.recipespbspoonacular.viewModel.SearchViewModel

class SearchFragment : Fragment() {
    private val recyclerViewModel: RecipeDetailViewModel by viewModels {
        RecipeDetailViewModel.Factory
    }
    lateinit var binding: FragmentSearchBinding
    private val viewModel: SearchViewModel by viewModels {
        SearchViewModel.Factory

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        // Inflate the layout for this fragment

        binding.searchFragmentRv.adapter = RecipeSearchRecyclerAdapter(recyclerViewModel)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (viewModel != null)
            viewModel.search("burger")
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SearchFragment()
    }
}