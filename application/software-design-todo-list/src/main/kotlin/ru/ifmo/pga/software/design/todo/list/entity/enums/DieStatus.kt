package ru.ifmo.pga.software.design.todo.list.entity.enums

import jakarta.persistence.Converter
import ru.ifmo.pga.software.design.core.entity.enums.JpaEnum
import ru.ifmo.pga.software.design.core.entity.enums.JpaEnumConverter


enum class DieStatus(private val dbKey: String) : JpaEnum {
    DIED("D"),
    ALIVE("A");

    override fun getDbKey(): String {
        return dbKey
    }

    @Converter(autoApply = true)
    class JpaConverter : JpaEnumConverter<DieStatus>()
}
