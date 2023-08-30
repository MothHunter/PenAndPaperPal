package com.example.penandpaperpal.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.penandpaperpal.models.Spell
import com.example.penandpaperpal.models.getSpells

@Composable
fun SpellListScreen() {
    SpellList(spells = getSpells())
}

@Composable
fun SpellList(spells: List<Spell>) {
    LazyColumn {
        items (items = spells) {spell ->
            SpellCard(spell = spell)
        }
    }
}

@Composable
fun SpellCard(spell: Spell) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column {
            Text(text = spell.spellName)
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Lvl.: ${spell.spellLevel}")
                Text(text = "Range: ${spell.spellRange}")
                Text(text = "Cast Time: ${spell.castingTime}")
            }
        }
    }
}


@Composable
@Preview
fun SpellListPreview() {
    SpellListScreen()
}