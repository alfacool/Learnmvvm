package com.alfacool.learnmvvm.view

import com.alfacool.learnmvvm.model.PokemonSet

data class SetListViewState (
    var loading: Boolean = false,
    var error: Exception? = null,
    var data: MutableList<PokemonSet>? = null
)