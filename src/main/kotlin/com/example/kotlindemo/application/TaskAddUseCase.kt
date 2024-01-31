import org.springframework.stereotype.Service

@Service
sealed class TaskAddUseCase (
        private val repository: TaskRepositoryInterface
) {
    fun execute(task: Task) {
        this.repository.add(task)
    }
}