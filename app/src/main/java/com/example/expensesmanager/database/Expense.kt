package com.example.expensesmanager.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.expensesmanager.utils.DateTimeConverter
import java.time.OffsetDateTime


@Entity(tableName = "Expense_table")
data class Expense(
    val amount: Float = 0f,
    val spent: Boolean = true,
    val currency: String = "PLN",
    val company: String? = null,
    val category: String? = null,
    val description: String? = null,
    val time: String? = DateTimeConverter.fromOffsetDateTime(OffsetDateTime.now()),

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
