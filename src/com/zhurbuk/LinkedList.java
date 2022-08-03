package com.zhurbuk;

import java.util.Objects;

public class LinkedList {

    private Node<Integer> last;
    private Node<Integer> first;
    private int size;


    class Node<Integer> {
        int value;
        Node<Integer> next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void add(Object o) {
        Node<Integer> node = new Node<>((Integer) o);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void add(int index, Object o) {
        Objects.checkIndex(index, size + 1);
        Node<Integer> node = new Node<>((Integer) o);
        if (first == null) {
            first = last = node;
        } else if (index == 0) {
            node.next = first;
            first = node;
        } else if (index == size) {
            last.next = node;
            last = node;
        } else {
            Node<Integer> current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void remove(Object o) {
        if (first == null) {
        } else if (first.value == (Integer) o) {
            first = first.next;
        } else if (last.value == (Integer) o) {
            last = null;
        } else {
            Node<Integer> current = first;
            while (current.next != null) {
                if (current.next.value == (Integer) o) {
                    current.next = current.next.next;
                }
                current = current.next;
            }

        }
        size--;
    }

    public void print() {
        Node<Integer> node = first;

        if (first != null) {
            System.out.println(first.value);
        }
        while (node.next != null) {
            node = node.next;
            System.out.println(node.value);
        }
    }

}
