import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
sealed class TaskController (
        private val addUseCase: TaskAddUseCase,
        private val findByIdUseCase: TaskFindByIdUseCase,
        private val deleteByIdUseCase: TaskDeleteByIdUseCase
) {
    @PostMapping
    fun add(@RequestBody task: Task) {
        this.addUseCase.execute(task)
    }
    @GetMapping("{id}")
    fun findById(@PathVariable("id") id: UUID): Task {
        return this.findByIdUseCase.execute(id)
    }
    @DeleteMapping("{id}")
    fun deleteById(@PathVariable("id") id: UUID) {
        this.deleteByIdUseCase.execute(id)
    }
}