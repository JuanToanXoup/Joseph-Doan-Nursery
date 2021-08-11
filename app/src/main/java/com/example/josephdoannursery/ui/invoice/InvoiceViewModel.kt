package com.example.josephdoannursery.ui.invoice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InvoiceViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is invoice Fragment"
    }
    val text: LiveData<String> = _text
}