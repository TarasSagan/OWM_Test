package com.owm.test.ui.fragments.search

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.owm.test.R
import com.owm.test.ui.fragments.base.BaseFragment

class SearchFragment : BaseFragment(R.layout.search_fragment) {
    private lateinit var viewModel: SearchViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory)
                .get(SearchViewModel::class.java)
    }

}
