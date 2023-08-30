package com.example.penandpaperpal.viewmodels

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.penandpaperpal.database.PnPPRepository
import com.example.penandpaperpal.models.Spell
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SpellListVM: ViewModel() {
    val repository: PnPPRepository = PnPPRepository()
    private val _spellListState = MutableStateFlow(listOf<Spell>())
    val spellListState = _spellListState.asStateFlow()

}