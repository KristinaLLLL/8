package com.company;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        BoundedWaitList cl = new BoundedWaitList(25);
        int i = cl.getCapacity();
        System.out.println(i);
        Collection <String> collection = null;
        for (int k=0; k<10; k++){
            collection.add("vwrverve");
        }
        WaitList call=new WaitList(collection) {};
        call.toString();

    }
}
