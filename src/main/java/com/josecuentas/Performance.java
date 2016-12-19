package com.josecuentas;

/**
 * Created by iPibeDx on 18/12/16.
 */
public class Performance {
    public static final int LOOP = 1000000;
    public static void main(String[] args) {

        testStringBuilder();
        testStringBuffer();
        testStringConcat();
        testStringFormat();
    }

    private static void testStringConcat() {
        Runtime runtime = Runtime.getRuntime();
        long memoryPreExecute = runtime.freeMemory();
        long preTime = System.currentTimeMillis();
        loopStringConcat();
        long memoryPostExecute = runtime.freeMemory();
        long postTime = System.currentTimeMillis();


        long memoryUsed = memoryPreExecute - memoryPostExecute;
        long timeUsed = postTime - preTime;

        String message = new StringBuilder()
                .append("StringConcatTest\n")
                .append("============\n")
                .append("Memoria usada: ").append(memoryUsed).append("\n")
                .append("Tiempo de ejecucion: ").append(timeUsed).append("\n")
                .toString();
        System.out.println(message);
    }

    private static void testStringFormat() {
        Runtime runtime = Runtime.getRuntime();
        long memoryPreExecute = runtime.freeMemory();
        long preTime = System.currentTimeMillis();
        loopStringFormat();
        long memoryPostExecute = runtime.freeMemory();
        long postTime = System.currentTimeMillis();


        long memoryUsed = memoryPreExecute - memoryPostExecute;
        long timeUsed = postTime - preTime;

        String message = new StringBuilder()
                .append("StringFormat\n")
                .append("============\n")
                .append("Memoria usada: ").append(memoryUsed).append("\n")
                .append("Tiempo de ejecucion: ").append(timeUsed).append("\n")
                .toString();


        System.out.println(message);
    }

    private static void testStringBuilder() {
        Runtime runtime = Runtime.getRuntime();
        long memoryPreExecute = runtime.freeMemory();
        long preTime = System.currentTimeMillis();
        loopStringBuilder();
        long memoryPostExecute = runtime.freeMemory();
        long postTime = System.currentTimeMillis();


        long memoryUsed = memoryPreExecute - memoryPostExecute;
        long timeUsed = postTime - preTime;

        String message = new StringBuilder()
                .append("StringBuilder\n")
                .append("============\n")
                .append("Memoria usada: ").append(memoryUsed).append("\n")
                .append("Tiempo de ejecucion: ").append(timeUsed).append("\n")
                .toString();


        System.out.println(message);
    }

    private static void testStringBuffer() {
        Runtime runtime = Runtime.getRuntime();
        long memoryPreExecute = runtime.freeMemory();
        long preTime = System.currentTimeMillis();
        loopStringBuffer();
        long memoryPostExecute = runtime.freeMemory();
        long postTime = System.currentTimeMillis();


        long memoryUsed = memoryPreExecute - memoryPostExecute;
        long timeUsed = postTime - preTime;

        String message = new StringBuilder()
                .append("StringBufferTest\n")
                .append("============\n")
                .append("Memoria usada: ").append(memoryUsed).append("\n")
                .append("Tiempo de ejecucion: ").append(timeUsed).append("\n")
                .toString();


        System.out.println(message);
    }


    private static void loopStringFormat() {
        for( int i=0;i<LOOP; i++){
            String s = String.format( "Hi %s; Hi to you %s",i, + i*2);
        }
    }

    private static void loopStringConcat() {
        for( int i=0;i<LOOP; i++){
            String s = "Hi " + i + "; Hi to you " + i*2;
        }
    }

    private static void loopStringBuilder() {
        for( int i=0;i<LOOP; i++){
            String s = new StringBuilder().append("Hi ").append(i).append("; Hi to you ").append(i*2).toString();
        }
    }

    private static void loopStringBuffer() {
        for( int i=0;i<LOOP; i++){
            String s = new StringBuffer().append("Hi ").append(i).append("; Hi to you ").append(i*2).toString();
        }
    }
}
