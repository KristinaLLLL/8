package com.company;

import java.lang.annotation.ElementType;
import java.util.Collection;

public interface IWaitList <E>{
    default void add(int element){
        this.add(element);
    }
    default ElementType remove(){
        return this.remove();
    }
    default boolean contains(ElementType element){
        return this.contains(element);
    }
    default boolean containsAll(Collection c){
        return this.containsAll(c);
    }
    default boolean isEmpty(){
        return this.isEmpty();
    }

}
