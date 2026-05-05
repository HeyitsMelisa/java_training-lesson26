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
   private enum priority;
   private LocalDate dueDate;

    // TODO:
    // Define all required attributes

    public Task(String title, String description, Priority priority, LocalDate dueDate) {
       this.title=title;
       this.description=description;
       this.priority=priority;
       this.dueDate=dueDate;

       dueDate= 10.11.2011;
       
        // TODO:
        // Validate input
        // Initialize attributes
    }

    public String getTitle() {
        // TODO:
        return title;
    }

    public String getDescription() {
        // TODO:
        return description;
    }

    public Priority getPriority() {
        // TODO:
        return priority;
    }

    public LocalDate getDueDate() {
        // TODO:
        return dueDate;
    }

    public boolean isDone() {
        // TODO:
        return false;
    }

    public void markDone() {
        // TODO
       if(isDone()){
          return true;
       }
       return false;
    }

    @Override
    public String toString() {
        // TODO:
        // Return a readable representation of the task
        return "Title: " + getTitle() + " Description:" + getDescription() + "PrioLevel:" + getPriority() + "Due:" + getDueDate();
           
    }
}

class TaskManager {

    // TODO:
    List<Task> taskList = new List<Task>();

    public void addTask(Task task) {
        // TODO:
        taskList.add(task);
    }

    public void removeTask(String title) {
        // TODO:
        taskList.remove(title);
    }

    public void markTaskDone(String title) {
        // TODO:
        // Find a task by title and mark it as done
       for(int i=0;i<taskList.size();i++){
          if(taskList.get(i).equals(title)){// oder taskList.get(i) == title
             return title.isDone();// oder einfach nur isDone()?? Wenn ja why, weil woher soll die Methode dann wissen welcher titel is done sein muss
    }

    public void printAllTasks() {
        // TODO:
        // Print all tasks
       for(int i=0;i<taskList.size();i++){
          System.out.println(taskList.get(i));
    }

    public void printOpenTasks() {
        // TODO:
        // Print only tasks that are not done
       for(int i=0;i<taskList.size();i++){
          if(!(taskList.get(i).isDone())){ //oder taskList.get(i).isDone()==false
            System.out.println(taskList.get(i));
          }   
    }

    public void printCompletedTasks() {
        // TODO:
        // Print only completed tasks
        for(int i=0;i<taskList.size();i++){
          if(taskList.get(i).isDone()){ //oder taskList.get(i).isDone()==true
            System.out.println(taskList.get(i));
          } 
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
       List<Task> lst1=new List<Task>();
       lst1.add("Outlook");
       lst1.add("Copilot");
       lst1.add("Osu");
       lst1.add("League of Ledgends");
       lst1.add("Counterstrike");

       lst1.get("Outlook").markAsDone();
       lst1.get("Osu").markAsDone();

       lst1.printOpenTasks();
       lst1.printCompletedTasks();
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
