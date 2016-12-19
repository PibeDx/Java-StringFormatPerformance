package com.josecuentas.solid;

/**
 * Created by iPibeDx on 18/12/16.
 */
public class StringConcatTest implements ProcessTest{

    private final int loop;

    public StringConcatTest(int loop) {
        this.loop = loop;
    }

    public void process() {
        for( int i=0;i<loop; i++){
            String s = "Hi " + i + "; Hi to you " + i*2;
        }
    }
}
