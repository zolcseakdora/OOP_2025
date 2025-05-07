package oop.labor08.lab8_2;

import java.util.ArrayList;
import java.util.Stack;

public class StackAggregation {
    private final int capacity;
    private ArrayList<Object> items;

    public StackAggregation( int capacity) {
        this.capacity = capacity;
        items=new ArrayList<>(capacity);
    }
    public boolean isFull(){
        return this.capacity== items.size();
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }
    public void push(Object object){
        if(isFull()){
            System.out.println("A verem tele van");
            return;
        }
        {
            items.add(object);
        }
    }
    public Object top(){
        if(isEmpty()){
            System.out.println("A verem ures");
            return null;
        }
        {
            return items.getLast();
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("A verem ures");
            return;
        }
        {
            items.removeLast();
        }
    }
}
