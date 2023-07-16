package com.mosjak.cleanarchhilt.presentation.ui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mosjak.cleanarchhilt.feature.quote.presentation.R
import com.mosjak.cleanarchhilt.presentation.viewmodel.QuoteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuoteFragment : Fragment(R.layout.fragment_quote) {

    private val viewModel: QuoteViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.quotesTv).text = viewModel.getQuotes()
    }
}
