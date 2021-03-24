package com.alfacool.learnmvvm.main

import com.alfacool.learnmvvm.model.PokemonSet

data class MainViewState (
        var loading: Boolean = false,
        var error: Exception? = null,
        var data: MutableList<PokemonSet>? = null
)