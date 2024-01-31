import org.springframework.stereotype.Service
import java.util.UUID

@Service
sealed class TaskFindByIdUseCase (
        private val repository: TaskRepositoryInterface
) {
    fun execute(id: UUID): Task {
        val task = this.repository.findById(id) ?: throw Error()
        return task
    }
}