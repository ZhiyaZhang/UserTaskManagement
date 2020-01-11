import Task.OnceTask;
import Task.*;
import Task.TaskManager;
import Task.TotalCountTask;
import User.User;
import sun.management.jdp.JdpException;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a user name to initiate a user account");
        String userName = scanner.nextLine();
	    User currentUser = new User(userName);
        TaskManager taskManager = new TaskManager();
	    while(true){
	        System.out.println("what would you like to operate ?\n1.create a new task" +
                    "\n2.show all tasks list\n3.show tasks that I can do" +
                    "\n4.redeem goods\n5.check point transaction records\n6.exit the system");
	        int operation = Integer.parseInt(scanner.nextLine());
	        if(operation == 1){
                System.out.println("please input a task with correct format");
                String[] taskAttributes = scanner.nextLine().split(" ");//type + point + description + count
                String taskType = taskAttributes[0];
                int point = Integer.parseInt(taskAttributes[1]);
                String description = taskAttributes[2];
                Task newTask;
                switch(taskType){
                    case "OnceTask" :
                        newTask = new OnceTask(point, description);
                        break;
                    case "TotalCountTask" :
                        int totalCount = Integer.parseInt(taskAttributes[3]);
                        newTask = new TotalCountTask(point, description, totalCount);
                        break;
                    case "DailyCountTask" :
                        int dailyCount = Integer.parseInt(taskAttributes[3]);
                        newTask = new DailyCountTask(point, description, dailyCount);
                        break;
                }

            }
        }
    }
}
