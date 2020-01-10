package Task;

import java.util.Date;

/**
 * @ClassName Task
 * @Description TODO
 * @Author dingying
 * @Date 2020/1/10 19:42
 * @ModifyDate 2020/1/10 19:42
 * @Version 1.0
 */
public class Task {
    private Integer taskId;
    private Date startTime;
    private Date endTime;
    private String desc;
    private TaskStrategy taskStrategy;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TaskStrategy getTaskStrategy() {
        return taskStrategy;
    }

    public void setTaskStrategy(TaskStrategy taskStrategy) {
        this.taskStrategy = taskStrategy;
    }
}