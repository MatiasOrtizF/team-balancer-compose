package com.mfo.teambalancerapp.domain.model

data class Player (
    val uid: String,
    val name: String,
    val ratio: Float,
    var isSelected: Boolean = false
)