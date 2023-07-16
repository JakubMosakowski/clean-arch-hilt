package com.mosjak.cleanarchhilt.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.mosjak.cleanarchhilt.domain.interactor.GetQuotesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val useCase: GetQuotesUseCase
) : ViewModel() {

    fun getQuotes(): String = useCase.run().map { it.toString() }.joinToString("\n")
}
