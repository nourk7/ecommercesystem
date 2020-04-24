package com.ecommercesystem;

public class admin extends account{
    public admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void signin() {
        //proceed to admin page
    }

    public void addproduct(){
        //add product to database
    }

    public void removeproduct(){
        //removes product from database
    }

    public void editproduct(){
        //edit product info
    }

    public void reviewcomplaints(){

    }
}
