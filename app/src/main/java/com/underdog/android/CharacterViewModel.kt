package com.underdog.android

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class CharacterViewModel: ViewModel() {

    private val repository = CharacterRepository()

//    private var _liveData = MutableLiveData<>
//    val liveData: LiveData<> = _liveData

    fun fetchCharacters() {
        TODO("Implement me")
    }

    /**
     * Implement this if there is time.
     */
//    fun onCharacterUpdated(character: Character) {
//        val characterId = Random.nextInt(20)
//        // implement update
//        Log.i("CharacterUpdate", "Updated character id=$characterId")
//    }
}