# Task Manager

A simple Task Manager application implemented in Java where users can manage their tasks efficiently. This console-based program allows you to perform various operations on tasks such as adding new tasks, removing tasks, listing all tasks, marking tasks as done, and terminating the program.

## Features

- **Add a New Task**: Create a new task by providing a name and optional comments.
- **Remove a Task**: Delete a task by specifying its ID.
- **List All Tasks**: Display all tasks currently in the list.
- **Mark as Done**: Mark a specific task as completed.
- **Terminate Program**: Exit the Task Manager.

## How to Use

1. **Add a New Task**
   - Enter a task name.
   - Optionally, add comments related to the task.

2. **Remove a Task**
   - Input the ID of the task you want to remove from the list.

3. **List All Tasks**
   - View all tasks currently stored in the Task Manager.

4. **Mark as Done**
   - Specify the ID of the task you wish to mark as completed.

5. **Terminate Program**
   - Exit the Task Manager application.

## Usage Example

```plaintext
TASK MANAGER

1. Add a new task
2. Remove a task
3. List all tasks
4. Mark as done
5. Terminate program

Enter your choice: 1
Enter a name: Example Task
Enter the comments: This is an example task

Enter your choice: 3
Listing all tasks...
Task ID: 1, Name: Example Task, Comments: This is an example task, Status: Not Done

Enter your choice: 4
Enter the task that you want to mark as done: 1

Enter your choice: 5
Terminating...
