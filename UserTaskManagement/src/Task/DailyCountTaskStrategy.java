package Task;

import java.util.Date;

/**
 * @ClassName DailyCountTaskStrategy
 * @Description TODO
 * @Author dingying
 * @Date 2020/1/10 19:53
 * @ModifyDate 2020/1/10 19:53
 * @Version 1.0
 */
public class DailyCountTaskStrategy extends TaskStrategy {
   private int count = 0;
   private int max;
   private Date lastUpdateTime;

    public DailyCountTaskStrategy(int max){
        this.max = max;
    }

    @Override
    public void handle(UserTaskAction taskAction) {
        System.out.println("处理日更新任务");
        count++;
    }

    @Override
    public boolean shouldFinish() {
        return (count >= max);
    }

    public void update(){
         count = 0;
    }

    public void setMax(int max) {
        this.max = max;
    }
}