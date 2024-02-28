package controller;

import entities.Task;
import service.TaskManagementApplication;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TaskManagementApplication taskManager = new TaskManagementApplication();

        Scanner sc = new Scanner(System.in);
        int choice=0;
        do{

            System.out.println("**** Task Management Application ****");
            System.out.println("1. Add Task");
            System.out.println("2. Display Total Tasks");
            System.out.println("3. Search Task by Title");
            System.out.println("4. Search Task by Due Date");
            System.out.println("5. Mark Task as Completed");
            System.out.println("6. Display Completed Tasks");
            System.out.println("7. Remove Completed Tasks");
            System.out.println("8. Edit Task");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(sc.next());

            switch (choice) {
                /*in this case we call add task method
                * add i our list*/
                case 1:
                    System.out.println("1. Add Task");
                    taskManager.addTask();
                    break;

                case 2:

                    /*
                    * display total task from list*/
                    System.out.println("2. Display Total Tasks");
                    System.out.println(taskManager);
                    taskManager.displayTotalTasks();
                    break;

                case 3:
                    /*
                    * Search Task by using task Title*/
                    System.out.println("3. Search Task by Title");
                    System.out.println("Enter the title");
                    sc.nextLine();
                    String title= sc.nextLine();
                    taskManager.searchByTitle(title);
                    break;

                case 4:
                    /*
                    * Search Task by using Due Date of task*/
                    System.out.println("4. Search Task by Due Date");
                    System.out.println("Enter the Due date");
                    String dueDate= sc.next();
                    taskManager.searchByDueDate(dueDate);
                    break;

                case 5:
                    /*
                    *Mark Task as Completed in this method */
                    System.out.println("5. Mark Task as Completed");
                    System.out.println("Enter index which task is to be complete");
                    int index = sc.nextInt();
                    taskManager.markTaskAsCompleted(index);
                    System.out.println("Task marked as completed!!!");
                    break;

                case 6:
                    /*
                    * hear we display Completed Tasks*/
                    System.out.println("6. Display Completed Tasks");
                    taskManager.displayTotalCompletedTask();
                    break;

                case 7:
                    /*
                     * hear we remove Completed Tasks*/
                    System.out.println("7. Remove Completed Tasks");
                    taskManager.removeCompletedTasks();
                    System.out.println("Task removed successfully!!");
                    break;

                case 8:
                    /*
                     * hear we edit required Tasks*/
                    System.out.println("8. Edit Task");
                    System.out.println("Enter index which task is to be edit");
                    int index1 = sc.nextInt();
                    taskManager.editTask(index1);
                    System.out.println("Changes Done....:)");
                    break;

                default:
                    System.out.println("Invalid choice....!!");
            }

        }while (choice!=0);
    }
}