package Task;

/**
 * @ClassName UnlimitTaskStrategy
 * @Description TODO
 * @Author dingying
 * @Date 2020/1/11 14:12
 * @ModifyDate 2020/1/11 14:12
 * @Version 1.0
 */
public class UnlimitTaskStrategy extends TaskStrategy{
    @Override
    public void handle(UserTaskAction taskAction) {
        System.out.println("处理不限次数任务");
    }

    @Override
    public boolean shouldFinish() {
        return false;
    }
}