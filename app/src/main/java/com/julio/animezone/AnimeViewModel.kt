package com.julio.animezone

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AnimeViewModel : ViewModel() {
    private val myAnimeListService = MyAnimeListService.create()

    private val _animeList = MutableLiveData<List<Anime>?>()
    val animeList: MutableLiveData<List<Anime>?>
        get() = _animeList

    fun getAnimeList() {
        viewModelScope.launch {
            try {
                val response = myAnimeListService.getAnimeList()
                if (response.isSuccessful) {
                    val animeList = response.body()
                    _animeList.value = animeList
                } else {
                    // Manejar error
                }
            } catch (e: Exception) {
                // Manejar error
            }
        }
    }
}
