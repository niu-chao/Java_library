package dateUtil;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: nc
 * @description：timer (定时工具)
 */

public class TimerDemo {
    public static void main(String[] args){
        Timer timer = new Timer();

        //给定时器安排任务，延迟0秒执行，执行后间隔3秒再执行
        timer.schedule(new TimeT() , 0,1000 *3);
    }

}

class TimeT extends TimerTask {
    private int i = 1;
    @Override
    public void run() {
        System.out.println("第" + i +  "次执行！");
        i ++;
    }
}