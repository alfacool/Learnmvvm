package com.alfacool.learnmvvm

import android.app.Application
import com.alfacool.learnmvvm.datastore.PokemonCardLocalDataStore
import com.alfacool.learnmvvm.datastore.PokemonCardRemoteDataStore
import com.alfacool.learnmvvm.datastore.PokemonSetLocalDataStore
import com.alfacool.learnmvvm.datastore.PokemonSetRemoteDataStore
import com.alfacool.learnmvvm.repository.PokemonCardRepository
import com.alfacool.learnmvvm.repository.PokemonSetRepository
import com.alfacool.learnmvvm.webservice.RetrofitApp

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val pokemonTcgService = RetrofitApp.POKEMON_TCG_SERVICE
        PokemonSetRepository.instance.apply {
            init(PokemonSetLocalDataStore(), PokemonSetRemoteDataStore(pokemonTcgService))
        }

        PokemonCardRepository.instance.apply {
            init(PokemonCardLocalDataStore(), PokemonCardRemoteDataStore(pokemonTcgService))
        }
    }
}