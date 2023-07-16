package com.mosjak.cleanarchhilt.data.repository

import com.mosjak.cleanarchhilt.data.db.QuoteDb
import com.mosjak.cleanarchhilt.domain.model.Quote
import com.mosjak.cleanarchhilt.domain.repository.QuoteRepository
import javax.inject.Inject

class QuoteRepositoryImpl @Inject constructor(
    private val db: QuoteDb,
) : QuoteRepository {

    override fun getQuotes(): List<Quote> = db.getQuotes()
}
