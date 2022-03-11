package com.underdog.android.util

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.underdog.android.models.CharacterList

class MoshiUtil {

    private val moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()

    fun parseCharacterListResponse(response: String): CharacterList {
        return moshi.adapter(CharacterList::class.java).fromJson(response)!!
    }
}