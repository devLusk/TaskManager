import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    static int nextId = 1;
    static ArrayList<Task> tasks = new ArrayList<>();

    public static void addTask(String taskName, String comments) {
        Task newTask = new Task(nextId++, taskName, comments, false);
        tasks.add(newTask);
    }

    public static void removeTask(int taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);

            if (task.getTaskId() == taskId) {
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
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);

            if (task.getTaskId() == taskId) {
                task.setDone(true);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("TASK MANAGER \n");
            System.out.println("1. Add a new task");
            System.out.println("2. Remove a task");
            System.out.println("3. List all tasks");
            System.out.println("4. Mark as done");
            System.out.println("5. Terminate program \n");

            System.out.print("Enter your choose: ");
            int choose = Integer.parseInt(scr.nextLine());

            switch (choose) {
                case 1: {
                    System.out.println("Enter a name: ");
                    String taskName = scr.nextLine();

                    System.out.println("Enter the comments: ");
                    String comments = scr.nextLine();

                    addTask(taskName, comments);
                    break;
                }
                case 2: {
                    System.out.print("Enter the task ID: ");
                    int taskId = Integer.parseInt(scr.nextLine());

                    removeTask(taskId);
                    break;
                }
                case 3: {
                    System.out.println("Listing all tasks...");

                    listTask();
                    break;
                }
                case 4: {
                    System.out.print("Enter the task that you want to mark as done: ");
                    int taskId = Integer.parseInt(scr.nextLine());

                    markAsDone(taskId);
                    break;
                }
                case 5: {
                    System.out.println("Terminating...");
                    break loop;
                }
            }
        }
    }
}