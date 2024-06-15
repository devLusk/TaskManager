import javax.xml.stream.events.Comment;
import java.util.ArrayList;

public class TaskList {
    // adicionar tarefas, remover tarefas, marcar como concluídas, listar tarefas.

    static ArrayList<Task> tasks = new ArrayList<>();

    public static void addTask(int taskId, String taskName, String comments, Boolean done) {
        Task newTask = new Task(taskId, taskName, comments, done);
        tasks.add(newTask);
    }

    public static void removeTask(int taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);

            if (task.getTaskId() == taskId){
                tasks.remove(i);
            }
        }
    }

    public static void listTask() {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println(task);
        }
    }

    public static void markAsDone(int taskId) {
        for (int i = 0; i < tasks.size(); i++){
            Task task = tasks.get(i);

            if (task.getTaskId() == taskId) {
                task.setDone(true);
            }
        }
    }

    public static void main(String[] args) {
        addTask(1, "Start Coding", "Start at 08am", false);
        addTask(2, "Stop Coding", "Stop at 08pm", false);
        addTask(3, "Get a girlfriend", "Start Trying", false);

        removeTask(3);

        markAsDone(2);

        listTask();
    }
}