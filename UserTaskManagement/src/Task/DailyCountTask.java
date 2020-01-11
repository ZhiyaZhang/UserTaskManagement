package Task;

public class DailyCountTask extends Task implements TaskStrategy {

    private int dailyCount;
    private int hasBeenDoneCount;

    public DailyCountTask(int point, String des, int dailyCount){
        this.setPoint(point);
        this.setDescription(des);
        this.dailyCount = dailyCount;
        this.hasBeenDoneCount = 0;
    }

    public int doTask(){
        if(this.getTaskStatus() == TaskStatus.CLOSE){
            System.out.println("you cannot do this task anymore, it's been up its daily limit");
            return 0;
        }else{
            hasBeenDoneCount ++;
            if(hasBeenDoneCount == dailyCount)
                refreshStatus();
            return this.getPoint();
        }

    }

    public boolean refreshStatus(){
        this.setTaskStatus(TaskStatus.CLOSE);
        return true;
    }
    //only for daily count task
    public void dailyRefresh(){
        this.hasBeenDoneCount = 0;
        this.setTaskStatus(TaskStatus.OPEN);
    }
}
