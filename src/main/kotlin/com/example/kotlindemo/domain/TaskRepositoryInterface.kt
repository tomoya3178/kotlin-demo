import java.util.UUID

interface TaskRepositoryInterface {
  fun add(task: Task)
  fun findById(id: UUID): Task?
  fun update(task: Task)
  fun deleteById(id: UUID)
}