package com.underdog.android.models.mapper

import com.underdog.android.models.ShowCharacter
import com.underdog.android.models.NetworkShowCharacter

class ShowCharacterMapper {
    fun buildFrom(networkShowCharacter: NetworkShowCharacter): ShowCharacter {
        return ShowCharacter(
            id = networkShowCharacter.id,
            name = networkShowCharacter.name,
            gender = ShowCharacter.Gender.parse(networkShowCharacter.gender),
            image = networkShowCharacter.image,
            episode = networkShowCharacter.episode
        )
    }
}