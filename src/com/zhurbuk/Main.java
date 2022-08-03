package com.zhurbuk;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Product product1 = new Product("Potato", 2, 3);
        Product product2 = new Product("Tomato", 10, 2);
        Product product3 = new Product("Cucumber", 3, 1);
        Product product4 = new Product("Juice", 20, 1);
        Product product5 = new Product("Lemon", 15, 1);
        Product product6 = new Product("Banana", 22, 2);
        Cart cart = new Cart();
        cart.addElement(product1);
        cart.addElement(product2);
        cart.addElement(product3);
        cart.addElement(product4);
        cart.addElement(product5);
        cart.addElement(product6);
        cart.addElement(product3);
*/
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2,10);
        list.remove(4);
        list.print();
       System.out.println(list.size());
    }
}
