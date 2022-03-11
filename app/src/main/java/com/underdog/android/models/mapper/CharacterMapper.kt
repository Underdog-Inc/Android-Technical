package com.underdog.android.models.mapper

import com.underdog.android.models.Character
import com.underdog.android.models.NetworkCharacter

class CharacterMapper {
    fun buildFrom(networkCharacter: NetworkCharacter): Character {
        return Character(
            id = networkCharacter.id,
            name = networkCharacter.name,
            gender = Character.Gender.parse(networkCharacter.gender),
            image = networkCharacter.image,
            episode = networkCharacter.episode
        )
    }
}