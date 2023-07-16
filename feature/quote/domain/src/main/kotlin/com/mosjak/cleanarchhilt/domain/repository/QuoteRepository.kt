package com.mosjak.cleanarchhilt.domain.repository

import com.mosjak.cleanarchhilt.domain.model.Quote

interface QuoteRepository {

    fun getQuotes(): List<Quote>
}
