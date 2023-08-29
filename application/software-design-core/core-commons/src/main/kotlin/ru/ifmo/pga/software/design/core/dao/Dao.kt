package ru.ifmo.pga.software.design.core.dao

import ru.ifmo.pga.software.design.core.entity.AbstractEntity


interface Dao<T : AbstractEntity> {

    fun findAll(): List<T>

    fun findById(id: Long): T

    fun save(entity: T): T

    fun save(entities: Collection<T>): List<T>

    fun remove(entity: T)

    fun remove(id: Long)

    val entityClass: Class<T>
}
