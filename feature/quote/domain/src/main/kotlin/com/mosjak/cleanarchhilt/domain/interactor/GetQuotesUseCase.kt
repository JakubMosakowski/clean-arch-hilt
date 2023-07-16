package com.mosjak.cleanarchhilt.domain.interactor

import com.mosjak.cleanarchhilt.domain.model.Quote
import com.mosjak.cleanarchhilt.domain.repository.QuoteRepository
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val repository: QuoteRepository
) {

    fun run(): List<Quote> = repository.getQuotes()
}
