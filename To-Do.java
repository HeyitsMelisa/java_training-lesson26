/*
╔══════════════════════════════════════════════════════╗
║                 JAVA ASSIGNMENT                      ║
╠══════════════════════════════════════════════════════╣

Instructor:
Okan Acikel

Course:
Java Software Development

Topic:
Task Manager System

Difficulty:
Intermediate

Year:
2026

╠══════════════════════════════════════════════════════╣

OBJECTIVE:

Implement a task management system using object-oriented
programming principles.

╠══════════════════════════════════════════════════════╣

INSTRUCTIONS:

• Implement all TODO sections
• Do not modify method signatures
• Write clean and readable code
• Validate input data

╠══════════════════════════════════════════════════════╣

REQUIREMENTS:

Create the following components:

1. enum Priority
   - LOW
   - MEDIUM
   - HIGH

2. class Task
   Attributes:
   - title
   - description
   - priority
   - dueDate
   - done

   Methods:
   - constructor
   - getters
   - markDone()
   - toString()

3. class TaskManager
   Attributes:
   - List<Task> tasks

   Methods:
   - addTask(Task task)
   - removeTask(String title)
   - markTaskDone(String title)
   - printAllTasks()
   - printOpenTasks()
   - printCompletedTasks()
   - sortByPriority()
   - sortByDueDate()

╠══════════════════════════════════════════════════════╣

RULES:

• Title must not be null or empty
• Task objects must not be null
• Use a list to store tasks
• All logic belongs inside the classes, not in main

╠══════════════════════════════════════════════════════╣

BONUS:

• filterByPriority()
• printOverdueTasks()
• searchTaskByTitle()
• save/load tasks from file

╠══════════════════════════════════════════════════════╣

TEST IDEA:

Create at least 5 tasks.
Mark some tasks as done.
Print all, open and completed tasks.
Test both sorting methods.

╠══════════════════════════════════════════════════════╣

Instructor:
Okan Acikel

Java Programming Course

╚══════════════════════════════════════════════════════╝
*/

import java.time.LocalDate;
import java.util.List;

enum Priority {
    // TODO:
    // Define the enum values:
     LOW,
     MEDIUM,
     HIGH
   
}

class Task {
   private String title;
   private String description;
   private Priority priortity;
   private LocalDate dueDate;

    // TODO:
    // Define all required attributes

    public Task(String title, String description, Priority priority, LocalDate dueDate) {
        // TODO:
        // Validate input
        // Initialize attributes
       this.title=title;
       this.description=description;
       this.priority=priority;
       this.dueDate=dueDate;
    }

    public String getTitle() {
        
        return null;
    }

    public String getDescription() {
        // TODO:
        return null;
    }

    public Priority getPriority() {
        // TODO:
        return null;
    }

    public LocalDate getDueDate() {
        // TODO:
        return null;
    }

    public boolean isDone() {
        // TODO:
        return false;
    }

    public void markDone() {
        // TODO:
        // Set task status to done
    }

    @Override
    public String toString() {
        // TODO:
        // Return a readable representation of the task
        return null;
    }
}

class TaskManager {

    // TODO:
    // Define the task list

    public void addTask(Task task) {
        // TODO:
        // Add task to the list
    }

    public void removeTask(String title) {
        // TODO:
        // Remove a task by title
    }

    public void markTaskDone(String title) {
        // TODO:
        // Find a task by title and mark it as done
    }

    public void printAllTasks() {
        // TODO:
        // Print all tasks
    }

    public void printOpenTasks() {
        // TODO:
        // Print only tasks that are not done
    }

    public void printCompletedTasks() {
        // TODO:
        // Print only completed tasks
    }

    public void sortByPriority() {
        // TODO:
        // Sort tasks by priority
    }

    public void sortByDueDate() {
        // TODO:
        // Sort tasks by due date
    }
}

public class Main {
    public static void main(String[] args) {

        /*
        TODO:
        1. Create a TaskManager object
        2. Add at least 5 tasks
        3. Mark some tasks as done
        4. Print all tasks
        5. Print only open tasks
        6. Print only completed tasks
        7. Test sorting by priority
        8. Test sorting by due date
        */
    }
}
