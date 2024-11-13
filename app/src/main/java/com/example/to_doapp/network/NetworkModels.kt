package com.example.to_doapp.network

import com.example.to_doapp.data.model.TodoItem

data class TodoListResponse(
    val status: String,
    val list: List<TodoItem>,
    val revision: Int
)

data class TodoItemResponse(
    val status: String,
    val element: TodoItem,
    val revision: Int
)