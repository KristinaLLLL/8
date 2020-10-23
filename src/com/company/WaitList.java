package com.company;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class WaitList <E> implements IWaitList{
    protected ConcurrentLinkedQueue <E> content;
    WaitList(){
        this.content=null;
    }
    WaitList(Collection<E> c){
        for (int i = 0; i<c.size(); i++) {
            this.content.add(c.iterator().next());
        }
    }


    @Override
    public String toString() {
            return content.toString();
    }
}
