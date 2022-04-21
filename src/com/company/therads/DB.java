package com.company.therads;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DB {

    public static List<UUID> list = new ArrayList<>();


    public synchronized static void addData(UUID uuid) {
        list.add(uuid);
    }



    public synchronized static int getSize() {
        return list.size();
    }



}
