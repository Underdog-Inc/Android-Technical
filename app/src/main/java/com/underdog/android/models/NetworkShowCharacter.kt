package com.underdog.android.models

/**
 * Model to match "API response".
 */
data class NetworkShowCharacter(
    val id: Int,
    val name: String,
    val gender: String,
    val image: String,
    val episode: List<String>
)
