package org.gvp.dcs.ds;

import java.util.Scanner;

public class Queue_DS {
    public int queue[]=new int[5];
    public int front,rear;
    public Queue_DS(){
        front=-1;
        rear=-1;
    }

    // Enqueue Method
    public void enqueue(int value)
    {
        if(rear==4){
            System.out.println("Queue is Full.!!");
        }
        else if(rear==-1){
            rear=front=0;
            queue[rear]=value;
            System.out.println("Queue Rear Value Add:= "+queue[rear]);
            System.out.println("First Method");
        }
        else{
            rear+=1;
            queue[rear]=value;
            System.out.println("Queue Rear Value Add:= "+queue[rear]);
            System.out.println("Second Method");
        }
    }
    
    // Dequeue Method
    public void dequeue(){
        if(front==-1){
            System.out.println("Queue is Empty.!!");
        }
        else if(front==rear){
            System.out.println("Queue Front Value Remove:= "+queue[front]);
            front=rear=-1;
        }
        else{
            System.out.println("Queue Front Value Remove:= "+queue[front]);
            front+=1;
        }
    }

    // Display Method
    public void display(){
        if(front==-1){
            System.out.println("Queue is Empty.!!"); 
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(queue[i]+",");
            }
        }
    }
}