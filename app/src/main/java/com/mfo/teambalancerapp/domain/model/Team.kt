package com.mfo.teambalancerapp.domain.model

data class Team(
    val playerList: MutableList<Player>,
    val ratio: Float,
    val winRate: Float
)
