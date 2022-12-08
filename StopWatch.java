import java.time.LocalTime;

public class StopWatch {

    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        this.startTime = LocalTime.now();
    }

    //get
    public LocalTime startTime() {
        return this.startTime;
    }

    public LocalTime endTime() {
        return this.endTime;
    }

    public LocalTime start() {
        this.startTime = LocalTime.now();
        return this.startTime;
    }

    public LocalTime stop() {
        this.endTime = LocalTime.now();
        return this.endTime;
    }

    public long getElapsedTime() {
        long hour = (this.stop().getHour() - this.startTime.getHour())*3600;
        long min = (this.stop().getMinute() - this.startTime.getMinute())*60;
        long second = this.stop().getSecond() - this.startTime.getSecond();

        return hour + min + second;
    }
}