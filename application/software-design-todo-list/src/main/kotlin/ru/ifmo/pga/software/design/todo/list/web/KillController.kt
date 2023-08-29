package ru.ifmo.pga.software.design.todo.list.web

import kotlinx.coroutines.DelicateCoroutinesApi
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import ru.ifmo.pga.software.design.todo.list.service.DieStateService
import kotlin.system.exitProcess

/**
 * @author Gleb Pushkarev
 * @since 1.0.0
 */
@Controller
class KillController @Autowired constructor(
    private val dieService: DieStateService,
) {
    private val logger: Logger = LoggerFactory.getLogger(javaClass)

    @RequestMapping(value = ["/kill"], method = [RequestMethod.POST])
    fun kill(): String {
        if (dieService.changeDied()) {
            logger.error("Server died")
            exitProcess(-123)
        } else {
            logger.debug("I'm invincible!!!")
        }
        return "redirect:/lists"
    }
}
