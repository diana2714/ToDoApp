package com.example.to_doapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.to_doapp.data.model.TodoItem

@Composable
fun TodoItemCell(todoItem: TodoItem, onCheckedChange: (Boolean) -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        // Чекбокс для статуса задачи
        Checkbox(
            checked = todoItem.isCompleted,
            onCheckedChange = { isChecked -> onCheckedChange(isChecked) },
            modifier = Modifier.size(24.dp),
            colors = CheckboxDefaults.colors(
                checkedColor = Color(0xFF4CAF50),
                uncheckedColor = Color.Gray,
                checkmarkColor = Color.White
            )
        )


        Spacer(modifier = Modifier.width(8.dp))

        // Текст задачи с зачеркнутым стилем для выполненных задач
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = todoItem.text,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = if (todoItem.isCompleted) Color.Gray else Color.Black,
                    textDecoration = if (todoItem.isCompleted) TextDecoration.LineThrough else TextDecoration.None
                ),
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )
        }

        // Иконка информации
        Icon(
            imageVector = Icons.Default.Info,
            contentDescription = "Информация",
            tint = Color.Gray,
            modifier = Modifier
                .size(24.dp)
                .padding(start = 8.dp)
        )
    }
}
