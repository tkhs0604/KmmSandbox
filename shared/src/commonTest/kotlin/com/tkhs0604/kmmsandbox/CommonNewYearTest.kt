package com.tkhs0604.kmmsandbox

import kotlinx.datetime.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

class CommonNewYearTest {

    @Test
    fun `Days remaining until the next year are 1 if the starting date is the end of the year`() {
        val startingDate = LocalDate(2022, 12, 31)

        val remainingDays = daysUntilNewYear(startingDate)

        assertEquals(1, remainingDays)
    }

    @Test
    fun `Days remaining until the next year are 365 if the starting date is not a leap year and the beginning of the year`() {
        val startingDate = LocalDate(2023, 1, 1)

        val remainingDays = daysUntilNewYear(startingDate)

        assertEquals(365, remainingDays)
    }

    @Test
    fun `Days remaining until the next year are 366 if the starting date is a leap year and the beginning of the year`() {
        val startingDate = LocalDate(2024, 1, 1)

        val remainingDays = daysUntilNewYear(startingDate)

        assertEquals(366, remainingDays)
    }
}