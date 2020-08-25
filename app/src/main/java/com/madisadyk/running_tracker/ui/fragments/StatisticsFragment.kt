package com.madisadyk.running_tracker.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.madisadyk.running_tracker.ui.viewmodels.StatisticsViewModel
import com.madisadyk.running_tracker.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}