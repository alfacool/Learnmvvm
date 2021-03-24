package com.alfacool.learnmvvm.viewmodel

import com.alfacool.learnmvvm.model.PokemonCard

data class PokemonListViewState (
        val loading: Boolean = false,
        val error: Exception? = null,
        val data: MutableList<PokemonCard>? = null
)