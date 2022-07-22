package datastructures;

import datastructures.BTS.BinarySearchTree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree myBTS = new BinarySearchTree();
        System.out.println("Root = " + myBTS.root);
        myBTS.insert(50);
        System.out.println("Root = " + myBTS.root.value);
        myBTS.insert(50);
        myBTS.insert(25);
        myBTS.insert(68);
        myBTS.insert(10);
        myBTS.insert(27);
        myBTS.insert(99);
        myBTS.insert(67);
        System.out.println("Root = " + myBTS.root.right.value);
        System.out.println(myBTS.contains(25));

        System.out.println("PreOrder: " + myBTS.DFSPreOrder());
        System.out.println("PostOrder: " + myBTS.DFSPostOrder());
        System.out.println("InOrder: " + myBTS.DFSInOrder());
        System.out.println("BFS: " + myBTS.BFS());

    }
}
