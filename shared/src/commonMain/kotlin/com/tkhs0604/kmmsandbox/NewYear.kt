package com.tkhs0604.kmmsandbox

import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.daysUntil
import kotlinx.datetime.todayIn

fun daysUntilNewYear(startingDate: LocalDate = Clock.System.todayIn(TimeZone.currentSystemDefault())): Int {
    val closestNewYear = LocalDate(startingDate.year + 1, 1, 1)
    return startingDate.daysUntil(closestNewYear)
}
