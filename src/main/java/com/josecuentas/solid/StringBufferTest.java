package com.josecuentas.solid;

/**
 * Created by iPibeDx on 18/12/16.
 */
public class StringBufferTest implements ProcessTest {
    private final int loop;

    public StringBufferTest(int loop) {
        this.loop = loop;
    }

    public void process() {
        for( int i=0;i<loop; i++){
            String s = new StringBuffer().append("Hi ").append(i).append("; Hi to you ").append(i*2).toString();
        }
    }
}
