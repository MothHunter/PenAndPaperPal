package com.example.penandpaperpal.models

class Spell (
    var spellID: Int,
    val spellName: String,
    val spellLevel: Int,
    val castingTime: String = "-",
    val spellRange: String = "-",
    val target: String = "-",
    val components: String = "-",
    val duration: String = "-",
    val classes: List<String> = emptyList(),
    val descriptionFull: String = "-",
    val descriptionShort: String = "-",
    val higherLevel: String = "-",
    val ritualCasting: Boolean = false
) {
}

fun getSpells(): List<Spell> {
    return listOf(
        Spell(
            spellID = 0,
            spellName = "Fireball",
            spellLevel = 3,
            castingTime = "1 action",
            spellRange = "150 feet",
            target = "A point you choose within range",
            components = "V S M (A tiny ball of bat guano and sulfur)",
            duration = "Instantaneous",
            classes = listOf("Sorcerer", "Wizard"),
            descriptionFull = "A bright streak flashes from your pointing finger to a point you choose within range and then blossoms with a low roar into an explosion of flame. Each creature in a 20-foot-radius sphere centered on that point must make a Dexterity saving throw. A target takes 8d6 fire damage on a failed save, or half as much damage on a successful one. The fire spreads around corners. It ignites flammable objects in the area that aren’t being worn or carried.",
            descriptionShort = "8d6 fire damage to every creature in 20-foot sphere. Dexterity saving throw. Ignites objects that are not carried",
            higherLevel = "When you cast this spell using a spell slot of 4th level or higher, the damage increases by 1d6 for each slot level above 3rd",
            ritualCasting = false
        ),
        Spell(
            spellID = 1,
            spellName = "Heal",
            spellLevel = 6,
            castingTime = "1 action",
            spellRange = "60 feet",
            target = "A creature that you can see within range",
            components = "V S",
            duration = "Instantaneous",
            classes = listOf("Cleric", "Druid"),
            descriptionFull = "Choose a creature that you can see within range. A surge of positive energy washes through the creature, causing it to regain 70 hit points. This spell also ends blindness, deafness, and any diseases affecting the target. This spell has no effect on constructs or undead.",
            descriptionShort = "Heals 70 HP, ends blindness, deafness, and any diseases.",
            higherLevel = "When you cast this spell using a spell slot of 7th level or higher, the amount of Healing increases by 10 for each slot level above 6th.",
            ritualCasting = false
        ),
        Spell(
            spellID = 3,
            spellName = "Cure Wounds",
            spellLevel = 1,
            castingTime = "1 action",
            spellRange = "Touch",
            target = "A creature you touch",
            components = "V S",
            duration = "Instantaneous",
            classes = listOf("Bard", "Cleric", "Druid", "Paladin", "Ranger"),
            descriptionFull = "A creature you touch regains a number of hit points equal to 1d8 + your spellcasting ability modifier. This spell has no effect on undead or constructs.",
            descriptionShort = "Heal 1d8 + spellcasting ability HP",
            higherLevel = "When you cast this spell using a spell slot of 2nd level or higher, the Healing increases by 1d8 for each slot level above 1st.",
            ritualCasting = false
        )
    )
}