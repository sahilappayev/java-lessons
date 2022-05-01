package com.company.designpatterns.singletons;

public class Main {

    public static void main(String[] args) {

        DbConfiguration configuration = DbConfiguration.getInstance();
        DbConfiguration configuration1 = DbConfiguration.getInstance();
        DbConfiguration configuration2 = DbConfiguration.getInstance();
        DbConfiguration configuration3 = DbConfiguration.getInstance();
        DbConfiguration configuration4 = DbConfiguration.getInstance();



    }
}
