package org.example;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {


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
    }

    Node head = new Node(5);

    ArrayList<Integer> listOfValues = new ArrayList<>();

    public int[] add(int value) {
//        Node node3 = new Node(6);
//        Node node2 = new Node(5, node3);
//        this.head = new Node(4, node2);
        int[] list;
        Node current = this.head;
        this.listOfValues.add(head.value);
        if (current == null) {
            this.head = new Node(value);
            this.listOfValues.add(value);
        } else {
            while (current.next != null) {
                this.listOfValues.add(current.value);
                current = current.next;
            }
            current.next = new Node(value);
            this.listOfValues.add(value);
        }
//output to console
//        Node output = this.head;
//        while (output.next != null) {
//            System.out.print(output.value+ ", ");
//            output = output.next;
//        }
//        System.out.print(output.value);
        list=new int[listOfValues.size()];
        for(int i=0; i<listOfValues.size();i++){
            list[i]=listOfValues.get(i);
        }
        return list;
    }

    public void addAtIndex(int value, int index) {
        Node node3 = new Node(6);
        Node node2 = new Node(5, node3);
        Node head = new Node(4, node2);


        Node current = head;
        int size;
        if (head == null) size = 0;
        else size = 1;

        //count size
        while (current.next != null) {
            current = current.next;
            size++;
        }

        System.out.println("Size: " + size);

        if (size < index) {
            System.out.println("choose correct index");
        } else if (index == 0) {
            Node newHead = new Node(value, head);
            head=newHead;
            System.out.println("New head: " + newHead.value);
        } else {
            Node indexNode = head;
            int j = 0;
            while (j+1 != index) {
                indexNode = indexNode.next;
                j++;
            }
            System.out.println("Index node value"+indexNode.value);
            Node insertNode = new Node(value, indexNode.next);
            System.out.println("InsertNode: " + insertNode.value);
            Node previousNode= new Node(indexNode.value, insertNode);

            Node output = head;
            while (output.next != null) {
                System.out.println(output.value);
                output = output.next;
            }
            System.out.println(output.value);

//            System.out.println("head: "+head.value);
//            System.out.println("head next: "+head.next.value);
//            System.out.println("Node2" + node2.value);
//            System.out.println("Node2 next: " + node2.next.value);
//            System.out.println("Insert: " + insertNode.value);
//            System.out.println("Insert next: " + insertNode.next.value);
//            System.out.println("Index next:"+ indexNode.next.value);
//            System.out.println("Previous node: "+ previousNode.value);
//            System.out.println("Previous node next: "+ previousNode.next.value);

        }

    }


    public void deleteAtIndex(int index) {
        Node node3 = new Node(6);
        Node node2 = new Node(5, node3);
        Node head = new Node(4, node2);

        Node current = head;
        if(index==0){
            head=null;
        }else{
            int i=0;
            while(i!=index){
                current=current.next;
                i++;
            }
            current = new Node(current.value);
        }



        Node output = head;
        while (output.next != null) {
            System.out.println(output.value);
            output = output.next;
        }
        System.out.println(output.value);

    }

    public Node getAtIndex(int index) throws Exception{
        Node node3 = new Node(6);
        Node node2 = new Node(5, node3);
        Node head = new Node(4, node2);

        Node current = head;

        int i=0;
        while(i!=index){
            current=current.next;
            i++;
        }
        return current;
    }

}
