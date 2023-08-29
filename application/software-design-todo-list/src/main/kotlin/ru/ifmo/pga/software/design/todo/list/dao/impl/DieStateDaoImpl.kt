package ru.ifmo.pga.software.design.todo.list.dao.impl

import org.springframework.stereotype.Repository
import ru.ifmo.pga.software.design.core.dao.impl.GenericDaoImpl
import ru.ifmo.pga.software.design.todo.list.dao.DieStateDao
import ru.ifmo.pga.software.design.todo.list.entity.DieState

/**
 * @author Gleb Pushkarev
 * @since 1.0.0
 */
@Repository("dieStateListDao")
open class DieStateDaoImpl : GenericDaoImpl<DieState>(), DieStateDao
