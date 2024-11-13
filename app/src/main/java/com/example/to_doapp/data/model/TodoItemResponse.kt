package com.example.to_doapp.data.model

data class TodoItemResponse(
    val status: String,
    val list: List<TodoItemRequest>,
    val revision: Int
)
