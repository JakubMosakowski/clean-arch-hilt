package com.mosjak.cleanarchhilt.data.di

import com.mosjak.cleanarchhilt.data.repository.QuoteRepositoryImpl
import com.mosjak.cleanarchhilt.domain.repository.QuoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface DataModule {

    @Binds
    fun bindsQuoteRepository(
        quoteRepository: QuoteRepositoryImpl
    ): QuoteRepository
}
