package exercise2;

public class TaskConflictNotifier implements TaskObserver{
	 @Override
	    public void notifyConflict(Task newTask, Task existingTask) {
	        System.out.println("Error: Task '" + newTask.getDescription() + 
	            "' conflicts with existing task '" + existingTask.getDescription() + "'.");
	    }
}
