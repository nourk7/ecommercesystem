package com.ecommercesystem;

import java.util.ArrayList;


public class cart {
    ArrayList<product> products = new ArrayList<>();
    int numberOfItems;

    public cart(int numberOfItems) {
        this.numberOfItems = 0;
    }

    public void addproduct(product p){
        products.add(p);
        numberOfItems++;
    }

}
