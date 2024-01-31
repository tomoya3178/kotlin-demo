import Task
import TaskRepositoryInterface
import java.util.UUID

sealed class TaskRepository: TaskRepositoryInterface {
  private val tasks: MutableList<Task> = ArrayList()

  override fun add(task: Task) {
    this.tasks.add(task)
  }

  override fun findById(id: UUID): Task? {
    return tasks.find { it.equals(id) }
  }

  override fun deleteById(id: UUID) {
    this.tasks.filter { !it.equals(id) }
  }
}