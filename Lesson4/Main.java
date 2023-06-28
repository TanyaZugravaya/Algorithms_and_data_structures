package org.example.CW.Algorithms_and_data_structures.Lesson4;

public class Main {
    public static void main(String[] args) {

        RedBlackTree node = new RedBlackTree();

        node.insert(10);
        node.inorder();
        System.out.println("\n");
        node.insert(20);
        node.inorder();
        System.out.println("\n");
        node.insert(35);
        node.inorder();
        System.out.println("\n");
        node.insert(45);
        node.inorder();
        System.out.println("\n");
        node.insert(-43);
        node.inorder();
        System.out.println("\n");
        node.insert(84);
        node.inorder();
        System.out.println("\n");
        node.insert(87);
        node.inorder();
        System.out.println("\n");
        node.insert(-35);
        node.inorder();



//        HashMap map = new HashMap();
//
//        map.push(1, 2);
//        map.push(3, 4);
//
//        System.out.println(map.find(3));
//        System.out.println(map.find(2));
//
//        map.remove(3);
//        map.push(2, 5);
//
//        System.out.println(map.find(3));
//        System.out.println(map.find(2));

//        Tree tree = new Tree();
//
//        for (int i = 1; i <= 5; i++) {
//            tree.insert(i);
//        }

    }
}
