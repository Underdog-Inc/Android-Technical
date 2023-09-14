package com.underdog.android.util

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.underdog.android.BuildConfig

object SharedPrefUtil {

    private lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences(
            "${BuildConfig.APPLICATION_ID}_preferences",
            Context.MODE_PRIVATE
        )
    }

    fun setBoolean(value: Boolean, id: String) {
        sharedPreferences.edit {
            putBoolean(id, value)
        }
    }

    fun getBoolean(id: String, defaultValue: Boolean = false): Boolean {
        return sharedPreferences.getBoolean(id, defaultValue)
    }
}