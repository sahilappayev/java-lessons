package com.company.therads;

public class Demo {
    public static int a;

    public synchronized static void incA() {
        a++;
    }

    public synchronized static int getA(){
        return a;
    }

    public synchronized static void setA(int v){
        a = v;
    }


}
