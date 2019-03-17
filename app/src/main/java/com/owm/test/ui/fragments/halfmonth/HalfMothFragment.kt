package com.owm.test.ui.fragments.halfmonth

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import com.owm.test.R
import com.owm.test.ui.fragments.base.BaseFragment

class HalfMothFragment : BaseFragment(R.layout.half_moth_fragment) {
    private lateinit var viewModel: HalfMothViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory)
                .get(HalfMothViewModel::class.java)
    }

}
