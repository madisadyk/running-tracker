package com.madisadyk.running_tracker.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.madisadyk.running_tracker.ui.viewmodels.MainViewModel
import com.madisadyk.running_tracker.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()
}