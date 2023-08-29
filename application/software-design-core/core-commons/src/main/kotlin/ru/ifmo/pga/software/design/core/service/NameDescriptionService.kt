package ru.ifmo.pga.software.design.core.service

import ru.ifmo.pga.software.design.core.entity.NameDescriptionEntity


interface NameDescriptionService<T : NameDescriptionEntity> : Service<T> {
    fun findByName(name: String): List<T>
}
