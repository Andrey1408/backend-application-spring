package ru.ifmo.pga.software.design.core.dao

import ru.ifmo.pga.software.design.core.entity.NameDescriptionEntity


interface NameDescriptionDao<T : NameDescriptionEntity> : Dao<T> {
    fun findByName(name: String): List<T>
}
