package Task;

public class OnceTask extends Task implements TaskStrategy {

    public OnceTask(int point, String des){
        this.setPoint(point);
        this.setDescription(des);
    }

    public int doTask(){
        if(this.getTaskStatus() == TaskStatus.CLOSE){
            System.out.println("you cannot do this task anymore, you have done this once-time task");
            return 0;
        }else{
            refreshStatus();
            return this.getPoint();
        }
    }

    public boolean refreshStatus(){
        this.setTaskStatus(TaskStatus.CLOSE);
        return true;
    }
}
