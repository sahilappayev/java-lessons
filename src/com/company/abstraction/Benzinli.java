package com.company.abstraction;

public interface Benzinli {

    public static final String name = "Benzinli";

    public abstract void fullDepo();

    // default konkret method
    default void checkDepo(){
        fullDepo();
        System.out.println("Cheking depo capaity...");
    }

}
