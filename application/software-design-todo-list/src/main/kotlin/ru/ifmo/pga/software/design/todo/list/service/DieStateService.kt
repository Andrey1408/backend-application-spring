package ru.ifmo.pga.software.design.todo.list.service

import ru.ifmo.pga.software.design.core.service.Service
import ru.ifmo.pga.software.design.todo.list.entity.DieState


interface DieStateService : Service<DieState> {
    fun changeDied(): Boolean
}
