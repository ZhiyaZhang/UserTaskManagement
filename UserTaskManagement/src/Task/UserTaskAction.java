package Task;

import User.User;

import java.util.Date;

/**
 * @ClassName UserTaskAction
 * @Description TODO 记录用户对任务的一次执行
 * @Author dingying
 * @Date 2020/1/10 14:47
 * @ModifyDate 2020/1/10 14:47
 * @Version 1.0
 */
public class UserTaskAction {
   private Date actionTime;
   private Integer userId;

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}