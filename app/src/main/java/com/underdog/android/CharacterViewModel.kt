package com.underdog.android

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import kotlinx.coroutines.flow.flow

class CharacterViewModel(application: Application) : AndroidViewModel(application) {

    private val applicationContext
        get() = getApplication<Application>().applicationContext

}