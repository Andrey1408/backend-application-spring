package ru.ifmo.pga.software.design.core.entity

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import java.util.Date


@MappedSuperclass
abstract class NameDescriptionEntity : AbstractEntity() {
    @get:Column(name = "name")
    var name: String? = null

    @get:Column(name = "description")
    var description: String? = null

    companion object {
        const val NAME = "name"
        const val DESCRIPTION = "description"
    }
}
