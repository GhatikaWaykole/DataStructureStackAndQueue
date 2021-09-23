package com.example.DataStructureStack;

public class StackUsingLinkedList<E>{
    //create linked list node
        private class Node{
            E data;
            Node link;        //link reference node
        }
        Node top;
        //default constructor give null value at top
        public StackUsingLinkedList(){
            this.top = null;
        }
        /* push method
         * push stack operation to add the element at top
         */
        public void push(E x){
            //create temp node and give top value
            Node temp = new Node();
            if(temp == null){
                System.out.println("stack overflow");
            }
            temp.data = x;
            temp.link = top;
            top = temp;

        }
        //pop method to pop the stack value
        public void pop(){
            if(top == null){
                System.out.println("stack underflow");
            }
            else
                top = (top).link;
        }
        //peek method give top value
        public E peek(){
            if(top != null){
                return top.data;
            }
            else{
                System.out.println("stack underflow");
                return null;
            }
        }
        //display method to give the stack data
        public void display() {
            Node temp = null;
            if (top == null) {
                System.out.println("stack underflow");
            }
            temp = top;
            while (temp != null) {
                System.out.print(temp.data);
                System.out.print("->"+temp.data);
                temp = temp.link;
            }
        }
    }
