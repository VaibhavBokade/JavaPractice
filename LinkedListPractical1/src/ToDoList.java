public class ToDoList {
    Task head;

    public void addTask(String description) {
        Task newTask = new Task(description);
        if(head == null) {
            head = newTask;
        }else{
            Task current = head;
            while ((current.next != null)) {
                current=current.next;
            }
            current.next = newTask;
        }

    }

    public void removeTask(String description) {
        if(head == null) {
            System.out.println("Our list is already null");
        }
        if(head.description.equals(description)){
            head = head.next;
            System.out.println("Task removed: " + description);
        }


        Task current = head;
        while (current != null) {
            if(current.next.description.equals(description)) {
                current.next = current.next.next;
                System.out.println("Task removed: " + description);
            }

            current=current.next;
        }
    }

    public void displayTasks() {
        Task current = head;
        if (current == null) {
            System.out.println("Your to-do list is empty.");
            return;
        }
        System.out.println("Your To-Do List:");
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}
