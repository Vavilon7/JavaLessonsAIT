package HomWork30;

import java.util.Objects;

public class Task {
    private int taskId;
    private String description;
    private TaskStatus taskStatus;
    private String deadline;

    public Task(int taskId, String description, String deadline) {
        this.taskId = taskId;
        this.description = description;
        this.taskStatus = TaskStatus.NEW;
        this.deadline = deadline;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", description='" + description + '\'' +
                ", taskStatus=" + taskStatus +
                ", deadline='" + deadline + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return getTaskId() == task.getTaskId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getTaskId());
    }

}
