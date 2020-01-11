package PointManagement;

import Task.Task;

import java.util.ArrayList;

public class PointManager {
    private ArrayList<Task> finishedTaskList;
    private int totalPoint;

    public PointManager(){
        finishedTaskList = null;
        totalPoint = 0;
    }
    public void addTask(Task task){
        finishedTaskList.add(task);
        totalPoint += task.getPoint();
    }

    public ArrayList<Task> getFinishedTaskList(){
        return  finishedTaskList;
    }

    public int getTotalPoint(){
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }
}
