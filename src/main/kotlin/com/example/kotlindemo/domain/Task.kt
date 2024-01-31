
import java.util.UUID

sealed class Task (
  val id: UUID,
  val name: TaskName
) {
  fun equals(id: UUID): Boolean {
    return this.id == id
  }
}