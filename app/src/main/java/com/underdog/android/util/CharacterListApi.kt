package com.underdog.android.util

import android.content.Context
import com.underdog.android.R
import kotlinx.coroutines.delay

class CharacterListApi {
    suspend fun getCharacterListResponse(context: Context): String {
        delay(2_000)
        return context.resources.openRawResource(R.raw.characters).bufferedReader().use {
            it.readText()
        }
    }
}