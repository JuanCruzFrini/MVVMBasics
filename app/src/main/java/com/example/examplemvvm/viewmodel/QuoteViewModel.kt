package com.example.examplemvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplemvvm.model.QuoteModel
import com.example.examplemvvm.model.QuoteProvider

class QuoteViewModel :  ViewModel() {

    private val quoteModel = MutableLiveData<QuoteModel>()
    val _quoteModel:LiveData<QuoteModel> = quoteModel

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}