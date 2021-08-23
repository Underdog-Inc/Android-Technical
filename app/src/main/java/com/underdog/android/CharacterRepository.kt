package com.underdog.android

import kotlinx.coroutines.delay

class CharacterRepository {

    suspend fun getAllCharacters() {
        delay(2_000) // to simulate network call

        TODO("Implement me")
    }
}