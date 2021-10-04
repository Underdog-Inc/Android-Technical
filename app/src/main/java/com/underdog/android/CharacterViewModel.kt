package com.underdog.android

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.underdog.android.models.Character
import kotlinx.coroutines.launch
import kotlin.random.Random

class CharacterViewModel: ViewModel() {

    private val repository = CharacterRepository()

    private var _liveData = MutableLiveData<List<Character>>()
    val liveData: LiveData<List<Character>> = _liveData

    fun fetchCharacters(context: Context) = viewModelScope.launch {
        val characters = repository.getAllCharacters(context)
        _liveData.postValue(characters)
    }
}