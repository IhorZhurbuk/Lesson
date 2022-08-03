package com.zhurbuk;

public class Cart {
    private Product[] products = new Product[10];


    public void addElement(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    public void removeElement(String productName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(productName)) {
                products[i] = null;
            }
        }
    }

    public void getProductInfo() {
        
    }
}
