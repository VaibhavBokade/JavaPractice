// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        toDoList.addTask("Buy groceries");
        toDoList.addTask("Finish project");
        toDoList.addTask("Call a friend");

        toDoList.displayTasks();
        System.out.println("--------------------------------------------");
        //toDoList.removeTask("Finish project");

        toDoList.removeTask("Call a friend");
        System.out.println("--------------------------------------------");

        toDoList.displayTasks();
    }
}