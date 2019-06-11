package com.ksenia47.learn;

public class Main {

    public static void main(String[] args) {
        Arrays arraysTasks = new Arrays();
        String spiralArrayStr = arraysTasks.fillArrayAsSpiral(7, 5);
        System.out.println(spiralArrayStr);
    }
}