package Task;


import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> taskList;

    public TaskManager(){
        taskList = new ArrayList<Task>();
    }

    public void publishTask(Task task){
        taskList.add(task);
    }

    public ArrayList<Task> getTaskList(){
        return taskList;
    }

    public ArrayList<Task> getDoableTask(){
        ArrayList<Task> doableTaskList = new ArrayList<Task>();
        for(Task task : taskList){
            if (task.getTaskStatus() == TaskStatus.OPEN )
                doableTaskList.add(task);
        }

        return doableTaskList;
    }
}
