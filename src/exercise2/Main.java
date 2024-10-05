package exercise2;
import java.time.LocalTime;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		ScheduleManager manager = ScheduleManager.getInstance();
        TaskFactory taskFactory = new TaskFactory();
        TaskConflictNotifier conflictNotifier = new TaskConflictNotifier();

        manager.registerObserver(conflictNotifier);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Add Task\n2. Remove Task\n3. View Tasks\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter start time (HH:MM): ");
                    LocalTime startTime = LocalTime.parse(scanner.nextLine());
                    System.out.print("Enter end time (HH:MM): ");
                    LocalTime endTime = LocalTime.parse(scanner.nextLine());
                    System.out.print("Enter priority (Low, Medium, High): ");
                    String priority = scanner.nextLine();
                    
                    Task task = taskFactory.createTask(description, startTime, endTime, priority);
                    manager.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task description to remove: ");
                    String taskToRemove = scanner.nextLine();
                    if (manager.removeTask(taskToRemove)) {
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Error: Task not found.");
                    }
                    break;
                case 3:
                    manager.viewTasks();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
        scanner.close();
    }

}


