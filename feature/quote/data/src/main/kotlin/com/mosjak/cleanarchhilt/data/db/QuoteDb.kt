package com.mosjak.cleanarchhilt.data.db

import com.mosjak.cleanarchhilt.domain.model.Quote
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuoteDb @Inject constructor() {

    fun getQuotes(): List<Quote> = listOf(
        Quote(1, "Quote 1", "Author 1"),
        Quote(2, "Quote 2", "Author 2"),
        Quote(3, "Quote 3", "Author 3"),
        Quote(4, "Quote 4", "Author 4"),
    )
}
