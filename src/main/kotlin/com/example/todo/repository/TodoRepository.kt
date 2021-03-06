package com.example.todo.repository

import com.example.todo.domain.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TodoRepository : JpaRepository<Todo,Long> {
}