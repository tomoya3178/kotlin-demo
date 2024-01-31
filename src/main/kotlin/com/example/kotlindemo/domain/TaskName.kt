sealed class TaskName (
        private val value: String
) {
  init {
    if (value.isEmpty()) {
      throw Error()
    }
  }
  override fun toString (): String {
    return value
  }
}