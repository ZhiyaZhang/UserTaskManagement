package Task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTask {
    private Integer userId;
    private Task taskDefine;
    private UserTaskStatus status;
    private List<UserTaskAction> actionRecords ;
    private TaskStrategy strategy;

    public UserTask(Integer userId, Task taskDefine){
        this.userId = userId;
        this.taskDefine = taskDefine;
        this.strategy = taskDefine.getTaskStrategy();
        actionRecords = new ArrayList<>();
    }

    public Integer performTask(UserTaskAction userTaskAction){
        //执行任务返回积分；
        if(status == UserTaskStatus.FINISHED){
            return 0;
        }
        Date actionTime = userTaskAction.getActionTime();
        if(actionTime.before(taskDefine.getStartTime())||actionTime.after(taskDefine.getEndTime())){
            status = UserTaskStatus.FINISHED;
            return 0;
        }
        //处理任务
        strategy.handle(userTaskAction);
        actionRecords.add(userTaskAction);
        //更新状态
        if(strategy.shouldFinish()){
            status = UserTaskStatus.FINISHED;
        }else {
            status = UserTaskStatus.ACTIVE;
        }
        return taskDefine.getPoint();
    }

    public UserTaskStatus getStatus(Date date){
        if(date.after(taskDefine.getEndTime())){
            status = UserTaskStatus.FINISHED;
        }
        return status;
    }

    public List<UserTaskAction> getActionRecords(){
        return actionRecords;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
