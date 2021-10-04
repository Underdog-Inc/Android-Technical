package com.underdog.android.models

import java.util.*

/**
 * Domain layer model.
 */
data class Character(
    val id: Int,
    val name: String,
    val gender: Gender,
    val image: String,
    val episode: List<String>
) {
    enum class Gender {
        MALE, FEMALE;

        companion object {
            fun parse(gender: String): Gender {
                return when (gender.lowercase(Locale.US)) {
                    "male" -> MALE
                    else -> FEMALE
                }
            }
        }
    }
}
