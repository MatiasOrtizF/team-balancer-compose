package com.mfo.teambalancerapp.domain.model

data class PlayerTeam (
    val name: String,
    val ratio: Float,
    var isSelected: Boolean = false
)