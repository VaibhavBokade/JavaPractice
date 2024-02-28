package serviceInterface;



import entities.Task;

import java.util.ArrayList;
import java.util.List;
/*
* Hear we declare the various methods which we implement in our service class*/
public interface ITaskManagementApplication {
    public void addTask();
    public void sortTask();
    public void markTaskAsCompleted(int index);
    public void removeCompletedTasks();
    public void searchByDueDate(String date);
    public void displayTotalTasks();
    public void displayTotalCompletedTask();
    public void editTask(int index);

}
