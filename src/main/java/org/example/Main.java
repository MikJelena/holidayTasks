package org.example;

public class Main {
    public static void main(String[] args) {

        Task2 task2 = new Task2();
        Tasks3 tasks3 = new Tasks3();
        Task4 task4 = new Task4();
        Task1 task1 = new Task1();
        Task5 task5 = new Task5();


        System.out.println("Task 5 test");
        task5.root.insertElement(7);
        task5.root.insertElement(5);
        task5.root.insertElement(14);
        task5.root.insertElement(3);
        try {
            task5.root.findValue(111);
        } catch (Exception e) {
            System.out.println("Value's not found");;
        }
        task5.root.deleteValue(3);

        System.out.println("Task 1 test");
        //        System.out.println(task1.findSize());
        task1.add(1);
//        System.out.println(task1.findSize());
        task1.add(5);
        task1.add(8);
//        System.out.println(task1.findSize());
        task1.addAtIndex(4,1);
        task1.deleteAtIndex(1);
//        System.out.println(task1.findSize());
        System.out.println(task1.getAtIndex(6));



    }
}