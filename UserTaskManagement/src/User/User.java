package User;
import PointManagement.PointManager;
import PointManagement.RedeemingManager;

import  java.util.*;

public class User {
    private int userId;
    private String userName;
    PointManager pointManager;
    RedeemingManager redeemingManager;
    public User(String name){
        pointManager = new PointManager();
        redeemingManager = new RedeemingManager(0);
        this.userName = name;
        Calendar now = Calendar.getInstance();
        String currentTime = now.get(Calendar.YEAR)+""+now.get(Calendar.MONTH)+now.get(Calendar.DAY_OF_MONTH)+now.get(Calendar.HOUR_OF_DAY) +now.get(Calendar.MINUTE) + now.get(Calendar.SECOND);
        userId = Integer.parseInt(currentTime);
    }
}
