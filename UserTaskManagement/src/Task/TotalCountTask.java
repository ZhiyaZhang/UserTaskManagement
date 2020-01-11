package Task;

public class TotalCountTask extends Task implements TaskStrategy {
    int totalCount;
    int hasBeenDoneCount;

    public TotalCountTask(int point, String des, int totalCount){
        this.setPoint(point);
        this.setDescription(des);
        this.totalCount = totalCount;
        this.hasBeenDoneCount = 0;
    }

    public int doTask(){
        if(this.getTaskStatus() == TaskStatus.CLOSE){
            System.out.println("you cannot do this task anymore, it's been up the total limit");
            return 0;
        }else{
            hasBeenDoneCount ++;
            if(hasBeenDoneCount == totalCount)
                refreshStatus();
            return this.getPoint();
        }
    }

    public boolean refreshStatus(){
        this.setTaskStatus(TaskStatus.CLOSE);
        return true;
    }
}
