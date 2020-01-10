package Task;

/**
 * @ClassName TaskStrategy
 * @Description TODO
 * @Author dingying
 * @Date 2020/1/10 19:48
 * @ModifyDate 2020/1/10 19:48
 * @Version 1.0
 */
public abstract class TaskStrategy {
    public abstract void handle(UserTaskAction taskAction);
    public abstract boolean shouldFinish();
}