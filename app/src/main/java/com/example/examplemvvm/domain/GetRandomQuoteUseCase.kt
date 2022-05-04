package com.example.examplemvvm.domain

import com.example.examplemvvm.data.QuoteRepository
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val repository: QuoteRepository) {

    suspend operator fun invoke():Quote?{
        val quotes = repository.getAllQuotesFromDatabase()
        if (!quotes.isNullOrEmpty()){
            val randomNum = (quotes.indices).random()
            return quotes[randomNum]
        }
        return null
    }
}