package com.example.uas_buku

@Entity(tableName = "book_table")
data class Book(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val author: String,
    val publisher: String,
    val publicationYear: Int
)