package org.example;

import java.util.ArrayList;

public class Task5 {

    Node node5 = new Node(5);

    class Node{
        Node right;
        Node left;

        int filledValue;

        public Node(int filledValue){
            this.filledValue = filledValue;
            this.right=null;
            this.left=null;
        }

        public void insertElement(int value){

            if(value>filledValue){
                if(right==null) right=new Node(value);
                else right.insertElement(value);
            }
            if(value<filledValue){
                if(left==null) left=new Node(value);
                else left.insertElement(value);
            }

            //output
            printBT();
        }

        public void printBT(){
            System.out.print(filledValue + ", ");
            if(left!=null) left.printBT();
            if (right!=null) right.printBT();
        }

        public void findValue(int value){
            node5.insertElement(1);
            node5.insertElement(8);
            if(value==filledValue){
                System.out.println("Value " + value + " exists");
            }
            if(value<filledValue) left.findValue(value);
            if (value>filledValue) right.findValue(value);
            else{
                System.out.println("Value " + value + " does not exist");
            }
        }

//        public void deleteValue(int value){
//            node5.insertElement(1);
//            node5.insertElement(8);
//            if (findValue(value)==false){
//                System.out.println("Value " + value + " does not exist");
//            } else{

//            }
//
//        }

    }


}

