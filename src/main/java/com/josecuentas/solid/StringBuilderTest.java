package com.josecuentas.solid;

/**
 * Created by iPibeDx on 18/12/16.
 */
public class StringBuilderTest implements ProcessTest {

    private final int loop;

    public StringBuilderTest(int loop) {
        this.loop = loop;
    }

    public void process() {
        for( int i=0;i<loop; i++){
            String s = new StringBuilder().append("Hi ").append(i).append("; Hi to you ").append(i*2).toString();
        }
    }
}
