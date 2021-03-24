package com.alfacool.learnmvvm.datastore

import com.alfacool.learnmvvm.model.PokemonSet

interface PokemonSetDataStore {
    suspend fun getSets(): MutableList<PokemonSet>?
    suspend fun addAll(sets: MutableList<PokemonSet>?)
}