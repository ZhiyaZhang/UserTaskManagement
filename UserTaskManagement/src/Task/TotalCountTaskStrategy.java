package Task;

/**
 * @ClassName TotalCountTaskStrategy
 * @Description TODO
 * @Author dingying
 * @Date 2020/1/10 19:52
 * @ModifyDate 2020/1/10 19:52
 * @Version 1.0
 */
public class TotalCountTaskStrategy extends TaskStrategy {
    private int count = 0;
    private int max;

    public TotalCountTaskStrategy(int max){
        this.max = max;
    }


    @Override
    public void handle(UserTaskAction taskAction) {
        count++;
        System.out.println("处理不限期多次的任务,第{"+count+"}次");
     }

    @Override
    public boolean shouldFinish() {
        return (count >= max);
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}