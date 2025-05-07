package oop.labor08.lab8_2;

import java.util.ArrayList;
import java.util.Collection;

public class StackInheritance extends ArrayList {
    private final int capacity;

    public StackInheritance( int capacity) {
        super(capacity);
        this.capacity = capacity;
    }
    public boolean isFull(){
        return this.size()==capacity;
    }
    public boolean isEmpty(){
        return super.isEmpty();
    }
    public void push(Object object){
        if(isFull()){
            System.out.println(" A verem tele van");
            return;
        }
        {
           super.add(object);
        }
    }
    public Object top(){
        if(isEmpty()){
            System.out.println("ures verem ");
            return null;
        }
        {
            return super.getLast();
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("ures verem");
            return;
        }
        {
            this.removeLast();
        }
    }
}
