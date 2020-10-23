package com.company;

import java.lang.annotation.ElementType;

public class UnfairWaitList <E> extends WaitList {
    public UnfairWaitList() {}
    public void remove(E element){
        this.remove(element);
    }
    public void moveToBack(E element){
        this.moveToBack(element);
    }

}
