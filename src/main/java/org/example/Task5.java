package org.example;

import java.util.ArrayList;

public class Task5 {



    Node root;


    public Task5() {
        this.root = new Node();

    }

    public Task5(int value) {
        this.root = new Node(value);
    }

    class Node{
        Node right;
        Node left;
        int filledValue;

        public Node(int filledValue){
            this.filledValue = filledValue;
            this.right=null;
            this.left=null;
        }

        public Node(){

        }

        public void insertElement(int value){
            if(root.filledValue==0){
                root=new Node(value);
                System.out.println(value);
                return;
            }
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
            System.out.println();
        }



        public void findValue(int value) throws Exception{

            if(value==filledValue){
                System.out.println("Value " + value + " exists");
                return ;
            }
            if(value<filledValue) left.findValue(value);
            if (value>filledValue) right.findValue(value);


        }



        public void deleteValue(int value){

            if (value==filledValue){

                if(right==null && left==null){
                    filledValue=0;
                    left=null;
                    right=null;
                    System.out.println(value + " deleted");
                    return;
                }else{
                    int max = findMaxLeft();
                    root=new Node(max);
                }


            }
            if(value<filledValue) left.deleteValue(value);
            if (value>filledValue) right.deleteValue(value);

            printBT();
////
        }

        public void printBT(){
            System.out.print(filledValue + ", ");
            if(left!=null) left.printBT();
            if (right!=null) right.printBT();
        }

        public int findMaxLeft(){
            int max=0;
            if(filledValue>max){
                max=filledValue;
            }
            right.findMaxLeft();
            return max;

        }



    }



}

