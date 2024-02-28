public class Task {
    String description;
    Task next;

    public Task(String description) {
        this.description= description;
    }

    public void display() {
        System.out.println("Task "+ description);
    }
}
