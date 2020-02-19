package B3_HuongDoiTuong.BaiTap;

import java.time.Duration;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public void star() {
        this.startTime = java.time.LocalTime.now();
    }

    public void stop() {
        this.endTime = java.time.LocalTime.now();
    }

    public int getElapsedTime() {
        Duration duration = Duration.between(this.startTime, this.endTime);
        return (int) duration.toMillis();
    }

    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.star();
        System.out.println(stopWatch.getStartTime());
        for (int i = 0; i < 1000000000; i++) ;
        {
            stopWatch.stop();
        }
        System.out.println(stopWatch.getEndTime());


        System.out.println(stopWatch.getElapsedTime());
    }

}
