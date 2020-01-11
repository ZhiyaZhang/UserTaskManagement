package Task;

import java.util.Calendar;

public class Task {
    private int point;
    private int taskId;
    private String description;
    private TaskStatus taskStatus;

    public Task(){}
    public Task(int point, String des){
        taskStatus = TaskStatus.OPEN;
        this.point = point;
        this.description = des;
        Calendar now = Calendar.getInstance();
        String currentTime = now.get(Calendar.YEAR)+""+now.get(Calendar.MONTH)+now.get(Calendar.DAY_OF_MONTH)+now.get(Calendar.HOUR_OF_DAY) +now.get(Calendar.MINUTE) + now.get(Calendar.SECOND);
        taskId = Integer.parseInt(currentTime);
 //       this.taskStrategy = taskStrategy;
    }


    public TaskStatus getTaskStatus(){
        return  taskStatus;
    }
    public void setTaskStatus(TaskStatus taskStatus){
        this.taskStatus = taskStatus;
    }

    public void setPoint(int point){
        this.point = point;
    }

    public int getPoint(){
        return  point;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String des){
        this.description = des;
    }
}