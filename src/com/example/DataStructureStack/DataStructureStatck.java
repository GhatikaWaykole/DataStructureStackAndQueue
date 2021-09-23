package com.example.DataStructureStack;

public class DataStructureStatck <E>{
    public static void main(String args[]){
        /* stack implement use linkedlist
         * create a generic method and class to give any data
         */
        System.out.println("Welcome to queue implementation use linkedlist");
        //create object and give the push method value
        QueuqUsingLinkedList queuqUsingLinkedList = new QueuqUsingLinkedList();
        queuqUsingLinkedList.enqueue(56);
        queuqUsingLinkedList.enqueue(30);
        queuqUsingLinkedList.enqueue(60);
        queuqUsingLinkedList.display();
        System.out.println("queue front"+queuqUsingLinkedList.front.key);

       // System.out.println("queue front"+queuqUsingLinkedList.front.key);
      /*  StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(56);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(70);
        stackUsingLinkedList.display();
        System.out.println("top value"+stackUsingLinkedList.peek());
        stackUsingLinkedList.pop();
        stackUsingLinkedList.pop();
        System.out.println("top value"+stackUsingLinkedList.peek()); */
    }
}
