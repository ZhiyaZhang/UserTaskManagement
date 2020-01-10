package Task;

/**
 * @ClassName OnceTaskStrategy
 * @Description TODO
 * @Author dingying
 * @Date 2020/1/10 19:51
 * @ModifyDate 2020/1/10 19:51
 * @Version 1.0
 */
public class OnceTaskStrategy extends TaskStrategy {
    boolean isDone;
    @Override
    public void handle(UserTaskAction taskAction) {
        System.out.println("一次性项目处理");
        isDone = true;
    }

    @Override
    public boolean shouldFinish() {
        return isDone;
    }
}