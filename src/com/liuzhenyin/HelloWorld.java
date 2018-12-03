package com.liuzhenyin;

import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * Created by 玉玺 on 2018/11/27
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello 济南 , this is a new growth process ！");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        Calendar c=Calendar.getInstance();
        System.out.println(Calendar.AM);
    }
}
