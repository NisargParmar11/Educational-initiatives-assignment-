package exercise2;

public interface TaskObserver {
	void notifyConflict(Task newTask, Task existingTask);
}
