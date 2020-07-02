package glim.antony.scheduler.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //    @Scheduled(fixedRate = 1000)
    @Scheduled(cron = "0 */5 * * * ?)") //all times when system time will be multiple of five minutes and 00 seconds
    public void reportCurrentTime() {
        System.out.printf("The time is now %s\n", dateFormat.format(new Date()));
    }
}
