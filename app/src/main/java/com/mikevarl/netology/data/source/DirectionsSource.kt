package com.mikevarl.netology.data.source

import com.mikevarl.netology.data.model.Badge
import com.mikevarl.netology.data.model.Direction

interface DirectionsSource {

    suspend fun getDirections(): List<Direction>

}

class MockDirectionsSource : DirectionsSource {
    override suspend fun getDirections(): List<Direction> {
        return listOf(
            mockDirection("1", "TestDirection"),
        )
    }

    private fun mockDirection(id: String, title: String): Direction {
        return Direction(id, "", title, emptyList(), Badge("", "#FFF", "#E04D7E"))
    }
}