package com.underdog.android

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel

class CharacterViewModel(app: Application) : AndroidViewModel(app) {

    private val applicationContext: Context
        get() = getApplication<Application>().applicationContext

}