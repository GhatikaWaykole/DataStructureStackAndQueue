package com.example.DataStructureStack;

  /* linkedlist node to store the queue entry
   * create a new node
   * constructor to give the key
  */
class QNode{
    int key;
    QNode next;

    public QNode(int key) {
        this.key = key;
        this.next = null;
    }
}
class QueuqUsingLinkedList {
    //create QNode data of front and rear value
    QNode front,rear;
    //constructor to give value to front and rear
    public QueuqUsingLinkedList() {
        this.front = front;
        this.rear = rear;
    }
    //method to add key to the queue
    public void enqueue(int key){
        QNode temp = new QNode(key);
        // check the  queue is empty
        if(this.rear == null){
            this.front=this.rear = temp;            // add new node at front and rear there queue is empty
        }
        //add new node at end of the queue
        this.rear.next = temp;
        this.rear = temp;
    }
    //dislay the queue data
    public void display(){
        QNode temp = front;
        if(this.front == null){
            System.out.println("queue has no value");
        }
        while(temp.next != null){
            System.out.println(temp.key);
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println(temp.key);
        }
    }
}
