package ru.ifmo.pga.software.design.todo.list.entity

import jakarta.persistence.*
import ru.ifmo.pga.software.design.core.entity.AbstractEntity
import ru.ifmo.pga.software.design.todo.list.entity.enums.DieStatus


@Entity(name = DieState.TABLE_NAME)
@Table(name = DieState.TABLE_NAME)
class DieState : AbstractEntity() {

    @Id
    @SequenceGenerator(name = "seq_gen", sequenceName = "died_state_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_gen")
    @Column(name = "id", nullable = false)
    override fun getId(): Long? = id

    @get:Column(name = "status")
    var status: DieStatus = DieStatus.ALIVE

    companion object {
        const val STATUS = "status"

        const val TABLE_NAME = "died_state"
    }
}
