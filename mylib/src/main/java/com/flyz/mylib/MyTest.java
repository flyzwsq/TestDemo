package com.flyz.mylib;

public class MyTest {

    public static void print(String string){
        System.out.println("string = [" + string + "]");
    }

    public static boolean isEmpty(String str){
        return str==null || str.length()==0;
    }
}
