import org.springframework.stereotype.Service
import java.util.UUID

@Service
class TaskDeleteByIdUseCase(
        private val repository: TaskRepositoryInterface
) {
    fun execute(id: UUID) {
        this.repository.deleteById(id)
    }
}