package ru.ifmo.pga.software.design.todo.list.service.impl

import kotlinx.coroutines.Job
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import ru.ifmo.pga.software.design.core.service.impl.ServiceImpl
import ru.ifmo.pga.software.design.todo.list.dao.DieStateDao
import ru.ifmo.pga.software.design.todo.list.entity.DieState
import ru.ifmo.pga.software.design.todo.list.entity.enums.DieStatus
import ru.ifmo.pga.software.design.todo.list.service.DieStateService


@Service("dieStateListService")
open class DieStateServiceImpl : ServiceImpl<DieState, DieStateDao>(), DieStateService {

    @Transactional(propagation = Propagation.REQUIRED)
    override fun changeDied(): Boolean {
        val diedState = findAll().first()
        return if(diedState.status == DieStatus.DIED) {
            save(diedState.apply { status = DieStatus.ALIVE })
            false
        } else {
            save(diedState.apply { status = DieStatus.DIED })
            true
        }
    }
}
