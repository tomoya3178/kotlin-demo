import com.example.kotlindemo.application.TaskAddUseCase
import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
sealed class TaskController (
        private val addUseCase: TaskAddUseCase,
        private val findByIdUseCase: TaskFindByIdUseCase
) {
    @PostMapping
    fun add(@RequestBody task: Task) {
        this.addUseCase.execute(task)
    }
    @GetMapping("{id}")
    fun findById(@PathVariable("id") id: UUID): Task {
        return this.findByIdUseCase.execute(id)
    }
}