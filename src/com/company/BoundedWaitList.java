package com.company;

public class BoundedWaitList <E> extends WaitList{
    private int capacity;
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }
    public BoundedWaitList() {
        this.capacity=0;
    }
    public int getCapacity() {
        return capacity;
    }
    public void add( E element){}

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + getCapacity() +
                '}';
    }
}
