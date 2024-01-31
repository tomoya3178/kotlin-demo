package com.example.kotlindemo.application

import TaskRepositoryInterface
import java.util.UUID

class TaskDeleteByIdUseCase(
        private val repository: TaskRepositoryInterface
) {
    fun execute(id: UUID) {
        this.repository.deleteById(id)
    }
}