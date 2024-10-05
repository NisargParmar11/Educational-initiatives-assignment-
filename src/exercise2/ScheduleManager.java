package exercise2;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ScheduleManager {
	private static ScheduleManager instance;
    private List<Task> tasks;
    private List<TaskObserver> observers;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    // Singleton instance getter
    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    // Register observers
    public void registerObserver(TaskObserver observer) {
        observers.add(observer);
    }

    // Add task and check for conflicts
    public boolean addTask(Task task) {
        for (Task existingTask : tasks) {
            if (tasksOverlap(task, existingTask)) {
                notifyObservers(task, existingTask);
                return false;
            }
        }
        tasks.add(task);
        System.out.println("Task added: " + task);
        return true;
    }

    // Remove task
    public boolean removeTask(String description) {
        return tasks.removeIf(task -> task.getDescription().equals(description));
    }

    // View all tasks sorted by start time
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }
        tasks.sort(Comparator.comparing(Task::getStartTime));
        tasks.forEach(task -> System.out.println(task));
    }

    // Notify observers about task conflicts
    private void notifyObservers(Task newTask, Task existingTask) {
        for (TaskObserver observer : observers) {
            observer.notifyConflict(newTask, existingTask);
        }
    }

    // Check if two tasks overlap
    private boolean tasksOverlap(Task t1, Task t2) {
        return t1.getStartTime().isBefore(t2.getEndTime()) && t1.getEndTime().isAfter(t2.getStartTime());
    }
}
