package org.example.CW.Algorithms_and_data_structures.Lesson3;

//public class  {

public class List {
    public static Node head;
    static class Node {
        int value;
        Node next;
    }

    public static void pushFront(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }
    public static void print(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }
    public void revert(){
        Node temp = head;
        if(head !=null && head.next != null)
            revert(head.next, head);
        temp.next = null;
    }
    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }

    public static void main(String[] args) {

        List list = new List();
        for (int i = 1 ; i <=5 ; i++) {
            list.pushFront(i);
        }
        list.print();
        list.revert();
        list.print();
    }
}

