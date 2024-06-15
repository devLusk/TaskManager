public class Task {
    int taskId;
    String taskName;
    String comments;
    Boolean done;

    public Task(int taskId, String taskName, String comments, Boolean done) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.comments = comments;
        this.done = done;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", comments='" + comments + '\'' +
                ", done=" + done +
                '}';
    }
}