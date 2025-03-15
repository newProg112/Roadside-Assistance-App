package com.example.roadsideassistanceapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.roadsideassistanceapp.R

/**
 * A data class to represent the information presented in the mechanics card
 */
data class Mechanic(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val mechanics = listOf(
    Mechanic(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1),
    Mechanic(R.drawable.lola, R.string.dog_name_2, 16, R.string.dog_description_2),
    Mechanic(R.drawable.frankie, R.string.dog_name_3, 2, R.string.dog_description_3),
    Mechanic(R.drawable.nox, R.string.dog_name_4, 8, R.string.dog_description_4),
    Mechanic(R.drawable.faye, R.string.dog_name_5, 8, R.string.dog_description_5),
    Mechanic(R.drawable.bella, R.string.dog_name_6, 14, R.string.dog_description_6),
    Mechanic(R.drawable.moana, R.string.dog_name_7, 2, R.string.dog_description_7),
    Mechanic(R.drawable.tzeitel, R.string.dog_name_8, 7, R.string.dog_description_8),
    Mechanic(R.drawable.leroy, R.string.dog_name_9, 4, R.string.dog_description_9)
)