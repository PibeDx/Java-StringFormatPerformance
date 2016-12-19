package com.josecuentas.solid;

/**
 * Created by iPibeDx on 18/12/16.
 */
public class StringFormatTest implements ProcessTest{

    private final int loop;

    public StringFormatTest(int loop) {
        this.loop = loop;
    }

    public void process() {
        for( int i=0;i<loop; i++){
            String s = String.format( "Hi %s; Hi to you %s",i, + i*2);
        }
    }
}
