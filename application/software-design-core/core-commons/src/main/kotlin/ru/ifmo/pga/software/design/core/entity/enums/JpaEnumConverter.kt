package ru.ifmo.pga.software.design.core.entity.enums

import jakarta.persistence.AttributeConverter
import java.lang.reflect.ParameterizedType


abstract class JpaEnumConverter<T : JpaEnum> : AttributeConverter<T, String> {

    private val enumClass: Class<T>

    init {
        val type = this.javaClass.genericSuperclass as ParameterizedType
        @Suppress("UNCHECKED_CAST")
        enumClass = type.actualTypeArguments[0] as Class<T>
    }

    override fun convertToDatabaseColumn(attribute: T?): String? {
        return attribute?.getDbKey()
    }

    override fun convertToEntityAttribute(dbData: String?): T? {
        if (dbData == null) {
            return null
        }
        enumClass.enumConstants.forEach { prop ->
            if (prop.getDbKey() == dbData) {
                return prop
            }
        }
        //TODO: Add logs
        throw IllegalArgumentException(String.format("Invalid value '%s' for %s.", dbData, enumClass.simpleName))
    }
}
