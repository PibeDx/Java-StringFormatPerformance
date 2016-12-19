package com.josecuentas.solid;

/**
 * Created by iPibeDx on 18/12/16.
 */
public class MainTest {
    public static final int LOOP = 1000000;
    public static void main(String[] args) {
        test(new StringBufferTest(LOOP));
        test(new StringBuilderTest(LOOP));
        test(new StringConcatTest(LOOP));
        test(new StringFormatTest(LOOP));
    }
    private static void test(ProcessTest processTest) {
        Runtime runtime = Runtime.getRuntime();
        long memoryPreExecute = runtime.freeMemory();
        long preTime = System.currentTimeMillis();
        processTest.process();
        long memoryPostExecute = runtime.freeMemory();
        long postTime = System.currentTimeMillis();


        long memoryUsed = memoryPreExecute - memoryPostExecute;
        long timeUsed = postTime - preTime;
        String name = processTest.getClass().getSimpleName();
        String message = new StringBuilder()
                .append(name + "\n")
                .append("============\n")
                .append("Memoria usada: ").append(memoryUsed).append("\n")
                .append("Tiempo de ejecucion: ").append(timeUsed).append("\n")
                .toString();
        System.out.println(message);
    }
}
