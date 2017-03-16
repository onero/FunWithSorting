/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting;

public class MyTimer {

    private static long startTime;

    private static long stopTime;

    private static long timeSpan;

    public static void start() {
        startTime = System.nanoTime();
    }

    public static void stop() {
        stopTime = System.nanoTime();
    }

    public static long getTimeInMillis() {
        timeSpan = stopTime - startTime;
        return timeSpan;
    }

    public static void reset() {
        startTime = 0;
        stopTime = 0;
        timeSpan = 0;
    }

}