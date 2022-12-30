package org.example;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

    public Node head;
    public Node tail;


//    public Task1() {
//    }

    public Task1(){
        head = new Node();
        tail = null;
        head.next=tail;
    }

    public class Node {
        Node next;
        int value;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
        public Node(){

        }
    }

    public void add(int value) {
        Node current = head;
        if (current.value==0) {
            head.value=value;
            System.out.println(head.value);
            return;
        } else if (current.next==null){
            head.next=new Node(value);
            printList();
            return;
        }
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
        printList();
    }

    public void addAtIndex(int value, int index) {

        Node current = head;
        int size = findSize();
        if (head.value == 0 || size==index) {
            add(value);
            return;
        } if (size < index) {
            System.out.println("choose correct index");
            return;
        } else if(index==0){
            Node newHead = new Node(value, head);
            head=newHead;
        } else{
                Node indexNode = head;
                int j = 0;
                while (j != index-1) {
                    indexNode = indexNode.next;
                    j++;
                }
                Node insertNode = new Node(value, indexNode.next);
                indexNode.next = insertNode;
        }
        printList();
    }


    public void deleteAtIndex(int index) {

        Node current = head;
        int size = findSize();
        if (head.value == 0) {
            return;
        } else if (size < index) {
            System.out.println("choose correct index");
            return;
        } else if(index==0){
            head = head.next;
        } else{
            Node indexNode = head;
            int j = 0;
            while (j != index-1) {
                indexNode = indexNode.next;
                j++;
            }
            indexNode.next = indexNode.next.next;
        }
        printList();

    }

    public int getAtIndex(int index) {

        if(findSize()<index){
            System.out.println("Index is out of list range ");
            return 0;
        }else{
            Node current = head;
            int i=0;
            while(i!=index){
                current=current.next;
                i++;
            }
            return current.value;
        }
    }

    public void printList(){
        Node current=head;
        do{
            System.out.print(current.value + ", ");
            current=current.next;
        }while (current.next!=null);
        System.out.print(current.value);
        System.out.println();
    }




//    public int[] printToArray(){
//        int size=findSize();
//        int[] array = new int[size];
//        int i = 0;
//        Node current=head;
//
//        do{
//            array[i]= current.value;
//            current=current.next;
//            i++;
//        }while (current.next!=null);
//            return array;
//    }

    public int findSize(){
        int size;
        Node current = head;
        if (head.value==0) size=0;
        else{
            size=1;
            while (current.next != null) {
                current = current.next;
                size++;
            }
        }
        return size;
    }


}
