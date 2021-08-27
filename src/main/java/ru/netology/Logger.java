package ru.netology;

import java.time.LocalDateTime;
import java.util.Date;

public class Logger {

    private int count = 1;
    private static Logger logger;
    private LocalDateTime start;

    private Logger(){
        LocalDateTime lt = LocalDateTime.now();
        this.start = lt;
    }

    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }
    protected void log(String msg){
        System.out.println("[ "+ start + "  " + count++ + " ] " + msg);
    }
}
