package com.underdog.android

import android.content.Context
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.underdog.android.models.Character
import com.underdog.android.models.CharacterList
import kotlinx.coroutines.delay

class CharacterRepository {

    private val moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()

    suspend fun getAllCharacters(context: Context): List<Character> {
        delay(2_000) // to simulate network call

        val json = context.resources.openRawResource(R.raw.characters).bufferedReader().use {
            it.readText()
        }

        val characterList = moshi.adapter(CharacterList::class.java).fromJson(json)
        return characterList!!.characters.map {
            Character(
                id = it.id,
                name = it.name,
                gender = Character.Gender.parse(it.gender),
                image = it.image,
                episode = it.episode
            )
        }
    }
}