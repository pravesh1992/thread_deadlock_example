package multithreading;

public class TaskResult {

  long threadId;

  int totalCount;

  public TaskResult(long threadId, int totalCount) {
    this.threadId = threadId;
    this.totalCount = totalCount;
  }

  public long getThreadId() {
    return threadId;
  }

  public void setThreadId(long threadId) {
    this.threadId = threadId;
  }

  public int getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  @Override
  public String toString() {
    return "TaskResult{" +
      "threadId=" + threadId +
      ", totalCount=" + totalCount +
      '}';
  }
}