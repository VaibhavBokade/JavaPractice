package comparators;

import entities.Task;

import java.util.Comparator;
/*by using this we sort task by priority*/
public class TaskSortByPriorityComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o1.getPriority()-o2.getPriority();
    }
}
