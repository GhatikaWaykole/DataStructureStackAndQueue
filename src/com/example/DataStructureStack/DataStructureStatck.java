package com.example.DataStructureStack;

public class DataStructureStatck <E>{
    public static void main(String args[]){
        /* stack implement use linkedlist
         * create a generic method and class to give any data
         */
        System.out.println("Welcome to stack implemetation use linkedlist");
        //create object and give the push method value
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(56);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(70);
        stackUsingLinkedList.display();
    }
}
