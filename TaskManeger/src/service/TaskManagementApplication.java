package service;

import entities.Task;
import serviceInterface.ITaskManagementApplication;

import java.util.*;
/*
* In this class we implement various methods which we mention in our ITaskManagementApplication interface*/

public class TaskManagementApplication implements ITaskManagementApplication {
    private List<Task> taskList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public TaskManagementApplication(List<Task> tasks) {
        this.taskList = taskList;
    }

    public TaskManagementApplication() {
    }
/*
* in this method we add the details related to task
* and add this details in our list*/
    @Override
    public void addTask() {
        System.out.println("give title to this task");
        //sc.nextLine();
        String taskTitle = sc.nextLine();
        System.out.println("Write description to this task");
        String desc = sc.nextLine();
        System.out.println("Give dueDate to this task");
        String date = sc.nextLine();
        System.out.println("Give priority to this task");
        int priority = sc.nextInt();
        Task task = new Task(taskTitle,desc,date,priority);
        taskList.add(task);
    }

    /*
    * hear we sort task by using priority
    * and then by using due date*/

    public void sortTask() {
        Comparator<Task> comparator = Comparator.comparing(Task::getPriority).thenComparing(Task::getDueDate);
        Collections.sort(taskList,comparator);
        System.out.println("After sorting");
        System.out.println(taskList);
    }

    /*
    * hear we change the status of our task*/
    public void markTaskAsCompleted(int index) {
        taskList.get(index).setCompleted(true);
    }

    /*
    * hear we remove completed task from our list*/
    public void removeCompletedTasks() {
        taskList.removeIf(Task::isCompleted);
    }

    /*
    * hear we search our required task by using title of task
    * */

    public void searchByTitle(String title) {
        for(Task t: taskList) {
            if(title.equals(t.getTitle())) {
                System.out.println(t);
            }
        }
    }

    /*
    * hear we search our required task by using due date of task */
    public void searchByDueDate(String date) {
        for(Task task : taskList) {
            if(date.equals(task.getDueDate())){
                System.out.println(task);
            }
        }
    }

    /*
    * hear we display total number of task*/
    public void displayTotalTasks() {
        for(Task t : taskList) {
            System.out.println(t);
        }
        System.out.println("Total number of Tasks in our list : " + taskList.size());
    }

    /*
    * hear we display total number of completed task*/

    public void displayTotalCompletedTask(){
        int count =0;
        for(Task t: taskList) {
            if(t.isCompleted()) {
                count++;
            }
        }
        System.out.println("Total completed tasks are :"+count);
    }

    /*
    * hear we edit our required task*/

    public void editTask(int index) {
        Task task = taskList.get(index);
        System.out.println("Set new title to this task");
        Scanner sc = new Scanner(System.in);
        task.setTitle(sc.nextLine());
        System.out.println("Set new description to this task");
        task.setDescription(sc.nextLine());
        System.out.println("Set new dueDate to this task");
        task.setDueDate(sc.nextLine());
        System.out.println("Set new priority to this task");
        task.setPriority(sc.nextInt());
        sortTask();


    }

}
